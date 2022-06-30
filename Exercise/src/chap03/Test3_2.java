package chap03;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		byte b = 5;
		b = (byte)-b;
		int result = 10 / b;
		System.out.println(result);
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		boolean stop = true;
		while(!stop) {
		}
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2; // 기본 계산은 int 형이기 때문에 소숫점이 버려짐 즉 둘중 하나를 double 형 변환 해주어야 double로 저장됨
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		int value = 356;
		System.out.println((value / 100) * 100);
		
		float varF1 = 10f;
		float varF2 = varF1 / 100;
		if(varF2 == 0.1F) { // float는 숫자 뒤에 F를 붙여주어야 정상 작동함
			System.out.println("10% 입니다.");
		}
		else {
			System.out.println("10%가 아닙니다.");
		}
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)(lengthTop + lengthBottom) * height / 2);
		System.out.println(area);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("첫 번째 수: ");
			String n1 = sc.next();
			System.out.print("두 번째 수: ");
			String n2 = sc.next();
		
			double nD1 = Double.parseDouble(n1);
			double nD2 = Double.parseDouble(n2);
			
	
			System.out.print("결과:");
			if(nD2 == 0.0F) {
				System.out.println("무한대");
			}
			else {
				System.out.println(nD1 / nD2);
			}
			
		}catch(Exception e) {
			System.out.println("숫자만 입력해라");
			sc.close();
			throw e;
		}
		
		int varR1 = 10;
		int varR2 = 3;
		int varR3 = 14;
		double varR4 = varR1 * varR1 * Double.parseDouble(varR2 + "." + varR3);
		System.out.println("원의 넓이:" + varR4);

		sc.nextLine(); // 앞의 엔터 입력이 next로는 사라지지 않아서 발생되는 오류 방지
		System.out.print("아이디: ");
		String name = sc.nextLine();
		
		System.out.print("패스워드: ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		}
		else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
		
		int x1 = 10;
		int y1 = 5;
		System.out.println( (x1>7) && (y1<=5)); // true
		System.out.println( (x1%3 == 2) || (y1%2 != 1)); // false
		
		int value2 = 0;
		
		value2 += 10;
		value2 -= 10;
		value2 *= 10;
		value2 /= 10;
		
		int score = 85;
		String result1 = (!(score>90)) ? "가" : "나";
		System.out.println(result1); // 가
		
		sc.close();

	}

}
