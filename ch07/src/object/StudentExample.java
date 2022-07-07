package object;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		// HashMap 객체 생성
		// Student 객체를 식별키로 String 값을 지정함
		HashMap <Student, Integer> hashMap = new HashMap<>();
		
		// 자료 삽입
		hashMap.put(new Student("1"), 95);
		hashMap.put(new Student("2"), 90);
		
		// 특정 자료 추출(검색)
		int score = hashMap.get(new Student("1"));
		int score2 = hashMap.get(new Student("2"));
		
		System.out.println("1번 학생의 국어 점수: " + score);
		System.out.println("2번 학생의 국어 점수: " + score2);
	}

}
