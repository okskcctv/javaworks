package ScannerEx;

import java.util.Scanner;

public class BonusPoint {

	public static void main(String[] args) {
		// 보너스 포인트 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요.");
		String name = sc.nextLine();
		
		System.out.print("구매 금액을 입력하세요.");
		int price = sc.nextInt();
		int bonusPoint = 0;
		final double bonusRatio = 0.05;
		
		// 계산
		bonusPoint = (int)(price * bonusRatio); // 형을 맞춰줘야 한다
		
		// 출력
		System.out.printf("%s님의 보너스 포인트는 %,d입니다.", name, bonusPoint);
		
		sc.close();
		

	}

}
