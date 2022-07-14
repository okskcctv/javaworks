package banking_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {
	// Account형 배열 공간 100개 준비
	private static ArrayList<Account> accountArray = new ArrayList<>(100);
	private static Scanner scanner = new Scanner(System.in);
	
	// 복구를 위한 예비 계좌 변수
	private static Account tempAccount = null;
	private static ArrayList<Account> tempAccountArray = new ArrayList<>(100);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌검색 | 6.계좌삭제 | 7.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.println("** 히든 메뉴 추가 ** '복구'나 '완전복구'입력");
			System.out.print("선택> ");
			
			String selectNo = scanner.next();
			if(selectNo.equals("1")){
				createAccount();	// 계좌 생성
			}
			else if(selectNo.equals("2")) {
				accountList();		// 계좌 목록
			}
			else if(selectNo.equals("3")) {
				deposit();			// 예금
			}
			else if(selectNo.equals("4")) {
				withdraw();			// 출금
			}
			else if(selectNo.equals("5")) {
				viewAccount();		// 계좌 검색
			}
			else if(selectNo.equals("6")) {
				removeAccount();	// 계좌 삭제
			}
			else if(selectNo.equals("7")) {
				run = false;		// 프로그램 종료
			}
			else if(selectNo.equals("복구")) {
				recover();
			}
			else if(selectNo.equals("완전복구")) {
				fullRecover();
			}
			else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}
		System.out.println("프로그램 종료!!");
		scanner.close();
	}

	// 계좌 생성
	private static void createAccount() {
		System.out.println("-----------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("-----------------------------------------");
		
		System.out.println("계좌 번호: ");
		String ano = scanner.next();
		if(findAccount(ano) == null && findTempAccount(ano) == null) {	// 계좌(ano)를 검색해보고 없는 계좌일 경우 생성해줌
			System.out.println("계좌주: ");
			String owner = scanner.next();
			
			int balance = 0;	// balance의 초기화
			while(true) {	// balance에 100원 이상이 들어올때까지 반복
				System.out.println("초기 입금액: ");
				balance = scanner.nextInt();
				if(balance >= 100) {
					break;
				}
				else {
					System.out.println("초기 입금액은 100원 이상이어야 합니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
			
			// 계좌 객체 생성
			Account newAccount = new Account(ano, owner, balance);
			accountArray.add(newAccount);
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
		else {	// 이미 있는 계좌를 입력한 경우 초기화면으로 되돌림
			System.out.println("이미 존재하는 계좌입니다.");
			System.out.println("초기화면으로 돌아갑니다.");
		}
	}
	
	// 계좌 목록
	private static void accountList() {
		boolean checked = true;
		if(accountArray.size() > 0) {
			
		}
		else {
			checked = false;
		}
		if(checked == true) {
			System.out.println("-----------------------------------------");
			System.out.println("계좌 목록");
			System.out.println("-----------------------------------------");
			
			for(int i=0; i<accountArray.size(); i++) {
				Account account = accountArray.get(i);
				if(account != null) {
					System.out.println("계좌번호: " + account.getAno() + "\t");
					System.out.println("계좌주: " + account.getOwner() + "\t");
					System.out.println("잔액: " + account.getBalance());
				}
			}
		}
		else {
			System.out.println("계좌가 존재하지 않습니다. 먼저 계좌생성을 진행해주세요.");
		}
	}
	
	// 예금
	private static void deposit() {
		boolean checked = true;		// 계좌가 있는지 확인하는 변수 선언 및 초기화
		if(accountArray.size() > 0) {
					// 계좌가 있으면 바로 넘어감 checked는 true
		}
		else{
			checked = false;	// 계좌가 없으면 false
		}
		if(checked == true) {	// 계좌가 있을때만 작동
			System.out.println("-----------------------------------------");
			System.out.println("예금");
			System.out.println("-----------------------------------------");
			
			Account account = null;
			while(true) {
				System.out.println("계좌 번호: ");
				String ano = scanner.next();
				
				account = findAccount(ano);		// 검색된 계좌 반환
				if(ano.equals("탈출")) {
					System.out.println("초기화면으로 돌아갑니다.");
					break;
				}
				else if(account == null) {
					System.out.println("계좌 번호가 존재하지 않습니다. 다시 입력해주세요");
					System.out.println("계좌 번호가 기억나지 않으시면 '탈출'을 입력해주세요");
				}
				else {
					while(true) {
						System.out.println("입금액: ");
						int money = scanner.nextInt();
						if(money <= 0) {
							System.out.println("0이나 음수는 입력할수없습니다.");
							System.out.println("다시 입력해 주세요.");
						}
						else if(money == 0) {
							System.out.println("입금을 취소하셨습니다.");
							System.out.println("초기화면으로 돌아갑니다.");
							break;
						}
						else {
							account.setBalance(account.getBalance() + money);
							System.out.println("결과: 입금을 성공하였습니다.");
							break;
						}
					}
					break;
				}
			}
		}
		else {	// 계좌가 없을 때 안내 메세지
			System.out.println("계좌가 존재하지 않습니다. 먼저 계좌생성을 진행해주세요.");
		}
	}
	
	// 출금
	private static void withdraw() {
		boolean checked = true;
		if(accountArray.size() > 0) {
			
		}
		else {
			checked = false;
		}
		if(checked == true) {
			System.out.println("-----------------------------------------");
			System.out.println("출금");
			System.out.println("-----------------------------------------");
			
			Account account = null;
			while(true) {
				System.out.println("계좌 번호: ");
				String ano = scanner.next();
				
				account = findAccount(ano);		// 검색된 계좌 반환
				if(ano.equals("탈출")) {
					System.out.println("초기화면으로 돌아갑니다.");
					break;
				}
				else if(account == null) {
					System.out.println("계좌 번호가 존재하지 않습니다. 다시 입력해주세요");
					System.out.println("계좌 번호가 기억나지 않으시면 '탈출'을 입력해주세요");
				}
				else if(account.getBalance() <= 0) {
					System.out.println("계좌 잔액이 부족하여 출금할 수 없습니다.");
					System.out.println("계좌 잔액은 " + account.getBalance() + "원입니다.");
					System.out.println("초기화면으로 돌아갑니다.");
					break;
				}
				else {
					while(true) {
						System.out.println("출금액: ");
						int money = scanner.nextInt();
						if(account.getBalance() < money) {
							System.out.println("계좌 잔액이 부족합니다.");
							System.out.println("다시 입력해 주세요.");
							System.out.println("계좌 잔액은 " + account.getBalance() + "원입니다.");
						}
						else if(money <= 0) {
							System.out.println("0이나 음수는 입력할수없습니다.");
							System.out.println("다시 입력해 주세요.");
						}
						else if(money == 0) {
							System.out.println("출금을 취소하셨습니다.");
							System.out.println("초기화면으로 돌아갑니다.");
							break;
						}
						else {
							account.setBalance(account.getBalance() - money);
							System.out.println("결과: 출금을 성공하였습니다.");
							break;
						}
					}
					break;
				}
			}
		}
		else {
			System.out.println("계좌가 존재하지 않습니다. 먼저 계좌생성을 진행해주세요.");
		}
	}
	
	// 계좌 검색
	private static void viewAccount() {
		boolean checked = true;
		if(accountArray.size() > 0) {
			
		}
		else {
			checked = false;
		}
		if(checked == true) {
			System.out.println("-----------------------------------------");
			System.out.println("계좌 검색");
			System.out.println("-----------------------------------------");
			
			while(true) {
				System.out.println("계좌 번호: ");
				String ano = scanner.next();
				
				if(findAccount(ano) == null) {
					System.out.println("존재하지 않는 계좌 번호 입니다.");
				}
				else {
					Account account = findAccount(ano);
					if(account != null) {
						System.out.println("계좌번호: " + account.getAno() + "\t");
						System.out.println("계좌주: " + account.getOwner() + "\t");
						System.out.println("잔액: " + account.getBalance());
					}
					break;
				}
			}
		}
		else {
			System.out.println("계좌가 존재하지 않습니다. 먼저 계좌생성을 진행해주세요.");
		}
	}

	// 계좌 삭제
	private static void removeAccount() {
		System.out.println("-----------------------------------------");
		System.out.println("계좌 삭제");
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.println("삭제할 계좌 번호: ");
			String ano = scanner.next();
			
			if(ano.equals("탈출")) {
				break;
			}
			else if(findAccount(ano) != null) {
				// accountArray.remove(findAccount(ano));
				remove(ano);
				System.out.println("삭제가 완료되었습니다.");
				break;
			}
			else {
				System.out.println("계좌 번호가 존재하지 않습니다. 다시 입력해주세요");
				System.out.println("계좌 번호가 기억나지 않으시면 '탈출'을 입력해주세요");
			}
		}
	}
	
	// 계좌 찾아서 지움
	private static void remove(String ano) {
		for(int i=0; i<accountArray.size(); i++) {
			if(accountArray.get(i) != null) {
				String dbAno = accountArray.get(i).getAno();
				if(dbAno.equals(ano)) {
					tempAccount = accountArray.get(i);
					tempAccount(ano);
					accountArray.remove(i);			
					break;
				}
			}
		}
	}
	
	// 계좌 찾기
	private static Account findAccount(String ano) {
		Account account = null;							// 찾는 계좌 객체 선언
		for(int i=0; i<accountArray.size(); i++) {
			if(accountArray.get(i) != null) {
				String dbAno = accountArray.get(i).getAno();// 이미 저장된 계좌를 가져와서
				if(dbAno.equals(ano)) {						// 찾을 계좌(ano)와 일치한다면
					account = accountArray.get(i);			// 배열에 저장된 계좌 대입
					break;
				}
			}
		}
		return account;
	}
	
	// 계좌 임시계좌목록에 추가
	private static boolean tempAccount(String ano) {
		for(int i=0; i<tempAccountArray.size(); i++) {
			if(tempAccountArray.get(i) != null) {
				String dbAno = tempAccountArray.get(i).getAno();
				if(dbAno.equals(ano)) {
					// 계좌가 존재할 경우 추가하지 않음
					return false;
				}
			}
		}
		tempAccountArray.add(tempAccount);
		return false;
	}
	
	// 복구 서비스
	private static boolean recover() {
		if(tempAccount == null) {
			System.out.println("복구할 계정이 존재하지 않습니다.");
			return false;
		}
		boolean checked = true;
		System.out.println("-----------------------------------------");
		System.out.println("계좌 복구 서비스입니다.");
		System.out.println("-----------------------------------------");
		
		while(checked) {
			System.out.println("복구를 원하시면 Y, 원하지 않으시면 N을 눌러주세요");
			System.out.println("복구는 직전에 삭제한 계좌만 가능합니다.");
			String select = scanner.next();
			
			if(select.equals("Y") || select.equals("y")) {
				while(true) {
					System.out.println("본인확인을 위해 계좌 번호를 입력해주세요.");
					System.out.println("계좌번호가 기억나지 않으시면 '탈출'을 입력해주세요");
					String ano = scanner.next();
					if(tempAccount.getAno().equals(ano)) {
						accountArray.add(tempAccount);
						tempAccountArray.remove(tempAccount);
						System.out.println("계좌가 복구되었습니다.");
						tempAccount = null;
						checked = false;
						break;
					}
					else if(ano.equals("탈출")){
						System.out.println("초기화면으로 돌아갑니다.");
						checked = false;
						break;
					}
					else {
						System.out.println("복구할 계좌번호가 입력하신 계좌번호와 다릅니다.");
					}
				}
			}
			else if(select.equals("N") || select.equals("n")) {
				System.out.println("취소를 누르셨습니다. 초기화면으로 돌아갑니다.");
				break;
			}
			else {
				System.out.println("지원하지 않는 기능입니다.");
			}
		}
		return false;
	}
	
	// 완전 복구 서비스
	private static boolean fullRecover() {
		if(tempAccountArray.size() <= 0) {
			System.out.println("복구할 계정이 존재하지 않습니다.");
			return false;
		}
		System.out.println("-----------------------------------------");
		System.out.println("계좌 복구 서비스입니다.");
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.println("복구할 계좌번호를 입력해 주세요.");
			System.out.println("계좌번호가 기억나지 않으시면 '탈출'을 입력해주세요");
			String ano = scanner.next();
			
			if(findAccount(ano) != null) {
				System.out.println("이미 존재하는 계좌번호입니다.");
				System.out.println("초기화면으로 돌아갑니다.");
				return false;
			}
			if(findTempAccount(ano) == null) {
				System.out.println("복구가 불가능한 계좌번호입니다.");
				System.out.println("다시 입력해주세요");
			}
			else {
				Account account = findTempAccount(ano);
				accountArray.add(account);
				tempAccountArray.remove(account);
				tempAccount = null;
				System.out.println("복구가 완료되었습니다.");
				return false;
			}
			if(ano.equals("탈출")) {
				System.out.println("초기화면으로 돌아갑니다.");
				return false;
			}
			
		}
	}
	
	// 복구계좌 찾기
	private static Account findTempAccount(String ano) {
		Account account = null;							// 찾는 계좌 객체 선언
		for(int i=0; i<tempAccountArray.size(); i++) {
			if(tempAccountArray.get(i) != null) {
				String dbAno = tempAccountArray.get(i).getAno();// 이미 저장된 계좌를 가져와서
				if(dbAno.equals(ano)) {							// 찾을 계좌(ano)와 일치한다면
					account = tempAccountArray.get(i);			// 배열에 저장된 계좌 대입
					break;
				}
			}
		}
		return account;
	}
}