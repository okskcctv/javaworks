package chap11;

import java.util.HashMap;

public class Test11_1 {

	public static void main(String[] args) {
		// 1. 4
		
		// 2. hashCode(), equals()
		
		// 3.
		// Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		// new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		
		// new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
		
		// 4.
		Member member = new Member("blue", "이파란");
		System.out.println(member);
		
		// 5. 4
		
		// 6.
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);
		System.out.println(str);
		
		// 7.
		String str1 = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str1.indexOf("자바");
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}
		else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str1 = str1.replace("자바", "java");
			System.out.println("-->" + str1);
		}
		
		// 8. 값의 범위가 -128 ~ 127인 경우 값을 비교하지만 그 이외에는 번지를 비교함
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		// 9.
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
	}

}

class Student{
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	// 3.
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}
}

class Member{
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// 4.
	@Override
	public String toString() {
		return id +": " + name;
	}
}