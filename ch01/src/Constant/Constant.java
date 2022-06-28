package Constant;

public class Constant {

	public static void main(String[] args) {
		// 상수 - 변하지 않는 것 대문자로 표기함
		// 상수 선언 할땐 final 선언
//		final int MONTH = 12;
		final int MAX_NUM = 100;
		final int MIN_NUM = 1;
		
//		UsingDefine myObject = new UsingDefine();
		int month = UsingDefine.MONTH;
		System.out.printf("1년은 %d개월이 있습니다\n", month);
		
		// MONTH = 6;
		// MAX_NUM = 1000;
		
//		System.out.println(MONTH);
		System.out.println(MAX_NUM);
		
		final double PI = 3.14;
		int radius = 5;
		double area = 0.0;
		
		area = radius * radius * PI;
		System.out.println(area);
		
	}

}
