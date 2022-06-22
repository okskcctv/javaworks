package ch01;

public class Variable {

	public static void main(String[] args) {
		String name; // 문자형 변수 name 선언
		name = "한지수";
		
		int grade; // 정수형 변수 grade 선언
		grade = 2;
		
		// int class; // 예약어는 변수로 사용 불가능
		int schoolClass = 3;
		
		System.out.println(name + "는" + grade + "학년"
				+ schoolClass + "반 입니다.");

	}

}
