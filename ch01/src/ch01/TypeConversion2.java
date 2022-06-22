package ch01;

public class TypeConversion2 {

	public static void main(String[] args) {
		// 사칙 연산
		int x = 10, y = 20;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y); // 계산 결과는 기본적으로 int 형
		
		System.out.println((double)x / y); // 서로다른 형식의 계산은 큰쪽으로 자동으로 변함

	}

}
