package Constructors;

public class Number {
	
	int x; // 필드 - 맴버 변수
	
	public Number() {
		x = 4;
	}

	public static void main(String[] args) {
		// 자신(Number) 클래스를 사용
		Number myNum = new Number();
		System.out.println(myNum.x);

	}

}
