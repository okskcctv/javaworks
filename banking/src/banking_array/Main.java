package banking_array;

import java.util.Scanner;

public class Main {
	// Account형 배열 공간 100개 준비
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
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
				run = false;		// 프로그램 종료
			}
			else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}
		System.out.println("프로그램 종료!!");
	}
	
	// 계좌 생성
	private static void createAccount() {
		System.out.println("-----------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("-----------------------------------------");
		
		System.out.println("계좌 번호: ");
		String ano = scanner.next();
		if(findAccount(ano) == null) {	// 계좌(ano)를 검색해보고 없는 계좌일 경우 생성해줌
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
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newAccount;
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}
		}
		else {	// 이미 있는 계좌를 입력한 경우 초기화면으로 되돌림
			System.out.println("이미 존재하는 계좌입니다.");
			System.out.println("초기화면으로 돌아갑니다.");
		}
	}
	
	// 계좌 목록
	private static void accountList() {
		boolean checked = true;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				break;
			}
			else {
				checked = false;
			}
		}
		if(checked == true) {
			System.out.println("-----------------------------------------");
			System.out.println("계좌 목록");
			System.out.println("-----------------------------------------");
			
			for(int i=0; i<accountArray.length; i++) {
				Account account = accountArray[i];
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
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				break;		// 계좌가 있으면 멈추고 바로 넘어감 checked는 true
			}
			else {
				checked = false;	// 계좌가 없으면 false
			}
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
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				break;
			}
			else {
				checked = false;
			}
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
	
	// 계좌 찾기
	private static Account findAccount(String ano) {
		Account account = null;							// 찾는 계좌 객체 선언
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();// 이미 저장된 계좌를 가져와서
				if(dbAno.equals(ano)) {					// 찾을 계좌(ano)와 일치한다면
					account = accountArray[i];			// 배열에 저장된 계좌 대입
					break;
				}
			}
		}
		return account;
	}
}