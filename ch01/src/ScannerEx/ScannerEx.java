package ScannerEx;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 입력 작업
		Scanner scan = new Scanner(System.in);
		
		// 문자열 입력
		System.out.print("당신의 이름은 무엇입니까?");
		String name = scan.nextLine();
		
		System.out.println(name);
		
		
		System.out.print("나이는 몇 살 입니까?");
		int age = scan.nextInt();
		
		System.out.println(age);
		
		scan.close();

	}

}
