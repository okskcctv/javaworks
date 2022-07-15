package banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import banking_db.common.JDBCUtil;

public class AccountDao {
	// JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	
	// 계좌 생성
	public void createAccount() {
		String ano = null;
		while(true) {
			System.out.println("계좌 입력");
			ano = sc.next();
			if(findAccount(ano).getAno() != null) {
				System.out.println("이미 있는 계좌입니다.");
			}
			else {
				break;
			}
		}
		
		System.out.println("계좌명 입력");
		String owner = sc.next();
		
		int balance = 0;
		while(true) {
			System.out.println("입금액 입력");
			balance = sc.nextInt();
			if(balance < 100) {
				System.out.println("최소 입금액은 100원 이상입니다.");
			}
			else {
				break;
			}
		}
		try {
			conn = JDBCUtil.getConnection();	// DB 연결 메서드 호출
			String sql = "INSERT INTO account (ano, owner, balance) VALUES (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			pstmt.setString(2, owner);
			pstmt.setInt(3, balance);
			
			pstmt.executeUpdate();	// db에 저장
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
			System.out.println("계좌 개설이 완료되었습니다.");
		}
	}
	
	// 목록 보기
	public List<Account> getAccountList() {
		List<Account> accountList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Account account = new Account();
				account.setAno(rs.getString("ano"));
				account.setOwner(rs.getString("owner"));
				account.setBalance(rs.getInt("balance"));
				
				accountList.add(account);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		for(Account list : accountList) {
			System.out.println(list.getAno());
			System.out.println(list.getOwner());
			System.out.println(list.getBalance());	
		}
		
		return accountList;
	}
	
	// 예금
	public boolean deposit() {
		String ano = null;
		while(true) {
			System.out.println("계좌를 입력해주세요.");
			ano = sc.next();
			if(ano.equals("탈출")) {
				return false;
			}
			else if(findAccount(ano).getAno() == null) {
				System.out.println("존재하지 않는 계좌입니다.");
			}
			else {
				break;
			}
		}
		int money = 0;
		while(true) {
			System.out.println("입금액을 입력해주세요.");
			money = sc.nextInt();
			if(money <= 0) {
				System.out.println("입금액은 0보다 큰 수여야 합니다.");
			}
			else {
				break;
			}
		}
		try {
			conn = JDBCUtil.getConnection();
			String sql = "UPDATE account SET balance = balance + ? WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, ano);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
		return false;
	}
	
	// 출금
	public boolean withdraw() {
		String ano = null;
		while(true) {
			System.out.println("계좌를 입력해주세요.");
			ano = sc.next();
			if(ano.equals("탈출")) {
				return false;
			}
			else if(findAccount(ano).getAno() == null) {
				System.out.println("존재하지 않는 계좌입니다.");
			}
			else {
				break;
			}
		}
		int money = 0;
		while(true) {
			if(findAccount(ano).getBalance() <= 0) {
				System.out.println("출금하기 위한 잔액이 모자랍니다.");
				System.out.println("초기화면으로 돌아갑니다.");
				return false;
			}
			System.out.println("출금액을 입력해주세요.");
			money = sc.nextInt();
			if(money <= 0) {
				System.out.println("출금액은 0보다 큰 수여야 합니다.");
			}
			if(findAccount(ano).getBalance() < money) {
				System.out.println("잔액이 모자랍니다.");
				System.out.println("현재 잔고는 " + findAccount(ano).getBalance() + "원 입니다.");
			}
			else {
				break;
			}
		}
		try {
			conn = JDBCUtil.getConnection();
			String sql = "UPDATE account SET balance = balance - ? WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setString(2, ano);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
		return false;
	}
	
	// 계좌 검색(출력)
	public boolean viewAccount() {
		String ano = null;
		while(true) {
			System.out.println("계좌를 입력해주세요.");
			ano = sc.next();
			if(ano.equals("탈출")) {
				return false;
			}
			else if(findAccount(ano).getAno() == null) {
				System.out.println("존재하지 않는 계좌입니다.");
			}
			else {
				break;
			}
		}
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("ano"));
				System.out.println(rs.getString("owner"));
				System.out.println(rs.getInt("balance"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return false;
	}
	
	// 계좌 삭제
	public boolean removeAccount() {
		String ano = null;
		String owner = null;
		while(true) {
			System.out.println("삭제할 계좌번호를 입력해주세요.");
			ano = sc.next();
			if(ano.equals("탈출")) {
				return false;
			}
			if(findAccount(ano).getAno() == null) {
				System.out.println("존재하지 않는 계좌입니다.");
			}
			else {
				break;
			}
		}
		while(true) {
			System.out.println("삭제하실 계좌의 계좌명을 입력해주세요.");
			owner = sc.next();
			if(findAccount(ano).getOwner().equals(owner)) {
				break;
			}
			if(ano.equals("탈출")) {
				return false;
			}
			else {
				System.out.println("계좌명이 일치하지 않습니다. 다시 입력해주세요.");
			}
		}
		try {
			conn = JDBCUtil.getConnection();
			String sql = 
//					"INSERT INTO account (ano, owner, balance) VALUES (?, ?, ?)" + 
					"DELETE FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, findAccount(ano).getAno());
//			pstmt.setString(2, findAccount(ano).getOwner());
//			pstmt.setInt(3, findAccount(ano).getBalance());
			pstmt.setString(1, ano);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
			System.out.println("계좌 삭제가 완료되었습니다.");
		}
		return false;
	}
	
	// 계좌 검색
	public Account findAccount(String ano) {
		Account account = new Account();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				account.setAno(rs.getString("ano"));
				account.setOwner(rs.getString("owner"));
				account.setBalance(rs.getInt("balance"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
	}
	
	
	// 임시계좌 보기
	public boolean viewTempAccount() {
		String ano = null;
		while(true) {
			System.out.println("계좌를 입력해주세요.");
			ano = sc.next();
			if(ano.equals("탈출")) {
				return false;
			}
			/* else if(findAccount(ano).getAno() == null) {
				System.out.println("존재하지 않는 계좌입니다.");
			} */
			else {
				break;
			}
		}
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM tempaccount WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("ano"));
				System.out.println(rs.getString("owner"));
				System.out.println(rs.getInt("balance"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return false;
	}
}
