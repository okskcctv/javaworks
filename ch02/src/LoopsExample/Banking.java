package LoopsExample;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		
		boolean run = true, inRun = true;
		int balance = 0;
		int money;
		
		System.out.println("****************************");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("****************************");
		
		while(run) {
			System.out.print("선택> ");
			String a = sc.next();
			switch(a){
			case "1":
				inRun = true;
				while(inRun) {
					System.out.print("입금액> ");
					money = sc.nextInt();
					if(money > 0) {
						balance += money;
						System.out.println("정상처리 되었습니다.");
						inRun = false;
					}
					else if(money <= 0) {
						System.out.println("음수를 입력할수 없습니다.");
					}
				}
				break;
			case "2":
				inRun = true;
				while(inRun) {
					System.out.print("출금액> ");
					money = sc.nextInt();
					if(money <= 0) {
						System.out.println("음수를 입력할수 없습니다.");
					}
					else if(balance >= money) {
						balance -= money;
						System.out.println("정상처리 되었습니다.");
						inRun = false;
					}
					else if(balance < money){
						System.out.println("잔고가 모자랍니다. 잔고를 확인해 주세요.");
						inRun = false;
					}
					else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
				break;
			case "3":
				System.out.printf("잔고> %,d\n", balance);
				break;
			case "4":
				inRun = true;
				while(inRun) {
					System.out.println("종료를 선택하셨습니다. 정말로 종료하시겠습니까?");
					System.out.print("선택(y/n)> ");
					String input = sc.next();
					switch(input) {
					case "y":
						System.out.println("프로그램을 종료합니다.");
						inRun = false;
						run = false;
						break;
					case "n":
						inRun = false;
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
				}
				break;
			default:
				System.out.println("지원하지 않는 기능 입니다.");
				break;
					
			}
		}
		
		System.out.println("프로그램 종료");
		sc.close();

	}

}
