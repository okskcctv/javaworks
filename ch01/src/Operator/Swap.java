package Operator;

public class Swap {

	public static void main(String[] args) {
		// 변수의 값을 바꾸는 프로그램
		int x = 0;
		int y = 1;
		int temp;
		
		System.out.println("교환 전");
		System.out.printf("x = %d, y = %d\n", x, y);
		System.out.println("---------------");
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("교환 후");
		System.out.printf("x = %d, y = %d", x, y);

	}

}
