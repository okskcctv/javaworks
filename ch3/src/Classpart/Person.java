package Classpart;

public class Person {
	String name;
	float height;
	float weight;
	
	// 생성자
	public Person() {
		System.out.println("사람을 생성합니다.");
	}
	
	public Person(String n) { // 외부에서 매개변수 입력
		System.out.println("사람을 생성합니다.");
		name = n;
	}
	
	public Person(String n, float h, float w) {
		name = n;
		height = h;
		weight = w;
		System.out.println("사람을 생성합니다.");
	}
	
	// 매서드
	public void showInfo() {
		System.out.printf("이름 : %s\n키 : %.1f\n몸무게 : %.1f\n", name, height, weight);
	}
}
