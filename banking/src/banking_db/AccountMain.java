package banking_db;

import java.util.Scanner;

public class AccountMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountDao dao = new AccountDao();
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌검색 | 6.계좌삭제 | 7.종료");
			System.out.println("--------------------------------------------------------------");
//			System.out.println("** 히든 메뉴 추가 ** '복구'나 '완전복구'입력");
			System.out.print("선택> ");
			
			String selectNo = scanner.next();
			if(selectNo.equals("1")){
				dao.createAccount();	// 계좌 생성
			}
			else if(selectNo.equals("2")) {
				dao.getAccountList();		// 계좌 목록
			}
			else if(selectNo.equals("3")) {
				dao.deposit();			// 예금
			}
			else if(selectNo.equals("4")) {
				dao.withdraw();			// 출금
			}
			else if(selectNo.equals("5")) {
				dao.viewAccount();		// 계좌 검색
			}
			else if(selectNo.equals("6")) {
				dao.removeAccount();	// 계좌 삭제
			}
			else if(selectNo.equals("7")) {
				run = false;		// 프로그램 종료
			}
			else if(selectNo.equals("복구")) {
//				recover();
			}
			else if(selectNo.equals("완전복구")) {
//				fullRecover();
			}
			else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}
		System.out.println("프로그램 종료!!");
		scanner.close();
	}
}