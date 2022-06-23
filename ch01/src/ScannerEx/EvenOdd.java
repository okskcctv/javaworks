package ScannerEx;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 홀 짝
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수":"홀수";
		System.out.printf("%s", result);
		
//		if(num % 2 == 0) {
//			System.out.printf("짝수");
//		}
//		else {
//			System.out.printf("홀수");
//		}

	}

}
