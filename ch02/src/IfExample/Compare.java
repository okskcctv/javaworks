package IfExample;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// 조건문과 조건 연산자
		Scanner sc = new Scanner(System.in);
//		int n1 = 4 , n2 = 5;
		int max;
		
		System.out.print("첫째수 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("둘째수 입력 : ");
		int n2 = sc.nextInt();
		
		max = (n1 > n2)? n1 : n2;
		System.out.printf("큰 수는 %d입니다\n",max);
		
		if(n1 > n2) {
			max = n1;
		}
		else {
			max = n2;
		}

		System.out.printf("큰 수는 %d입니다\n",max);

	}

}
