package SwitchCase;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int coffee = 5;
		
		while(true) {
			System.out.print("돈을 넣어주세요: ");
			int money = sc.nextInt();
			if(money > 500) {
				System.out.printf("거스름돈 %d를 돌려주고 커피가 나옵니다.\n", money - 500);
				coffee--;
				System.out.printf("남은 커피의 양은 %d개입니다.\n", coffee);
			}
			else if(money == 500) {
				System.out.print("커피가 나옵니다.\n");
				coffee--;
				System.out.printf("남은 커피의 양은 %d개입니다.\n", coffee);
			}
			else if(money < 500) {
				System.out.print("돈을 돌려주고 커피는 나오지 않습니다.\n");
				System.out.printf("남은 커피의 양은 %d개입니다.\n", coffee);
			}
			else {
				System.out.print("금액은 숫자입니다 숫자만 입력해 주세요.\n");
			}
			
			if(coffee == 0)
				break;
		}
		System.out.print("커피가 다 쩔어졌습니다. 판매를 중지 합니다.\n");
		
		sc.close();

	}

}
