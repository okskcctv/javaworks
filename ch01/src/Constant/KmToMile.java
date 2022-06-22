package Constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		// km를 mile로 변환
		final double RATE_KPH_MPH = 1.609344;
		double kph = 0.0;
		double mph = 0.0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("km/h를 입력해 주세요.");
		kph = scan.nextDouble();
				
		mph = kph * RATE_KPH_MPH;
		
		// 정수는 %d 실수는 %f
		System.out.printf("%.2f \n", mph);

		System.out.print("mile/h를 입력해 주세요.");
		mph = scan.nextDouble();
		kph = mph / RATE_KPH_MPH;
		

		System.out.printf("%.2f \n", kph);
		
		scan.close();
		

	}

}
