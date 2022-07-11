package wrapper;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {

		// integer 클래스의 num1이라는 객체
		Integer num1 = 100;		// 오토박싱(박싱) - 자동형변환
		int num2 = 200;
		int sum = num1.intValue() + num2;
		System.out.println(sum);
		
		// valueOf() -> 정수나 문자열을 Integer 클래스로 반환
		Integer n1 = Integer.valueOf("300");
		System.out.println(n1);
		
		// parseInt() -> 문자열을 int로 반환
		int n2 = Integer.parseInt("400");	// 언박싱
		System.out.println(n2);
		
		// ArrayList에서 사용
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		
		for(Integer i : numberList) {
			System.out.println(i);
		}
	}
}
