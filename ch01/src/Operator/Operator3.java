package Operator;

public class Operator3 {

	public static void main(String[] args) {
		// 비교, 논리 연산자
		System.out.println(7 < 4);
		System.out.println(7 >= 4);
		System.out.println(7 == 4);
		System.out.println(7 != 4);
		
		System.out.println((7 > 4) && (7 == 4));
		System.out.println((7 > 4) || (7 == 4));
		System.out.println(!(7 > 4));
		
		int n = 10, i = 2;
		boolean x = ((n = n + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(x);
		System.out.println(n);
		System.out.println(i);
		
		System.out.println("----------");
		x = ((n = n + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(x);
		System.out.println(n);
		System.out.println(i);

	}

}
