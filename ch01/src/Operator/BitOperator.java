package Operator;

public class BitOperator {

	public static void main(String[] args) {
		// 비트 논리 연산
		int num1 = 5; // 00000101
		int num2 = 10; // 00001010
		int result;
		result = num1 & num2;
		System.out.println(result); // 00000000
		
		result = num1 | num2;
		System.out.println(result); // 00001111

		// 비트 이동 연산
		int val = 2;
		System.out.println(val << 1); // 00000010 >> 00000100
		System.out.println(val << 3); // 00000010 >> 00010000
		System.out.println(val >> 1); // 00000010 >> 00000001
		
		int n = 10;
		int bNum = 0b1010;
		int hNum = 0x0a;
		
		System.out.println(n);
		System.out.println(bNum);
		System.out.println(hNum);
		
	}

}
