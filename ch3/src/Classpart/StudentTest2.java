package Classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		// 클래스의 객체 사용
		// Student() = 생성자
		Student s1 = new Student();
		Student s2 = new Student();
		
		
		s1.studentID = 100;
		s1.studentName = "다있소";
		s1.showInfo();
		
		s2.studentID = 101;
		s2.studentName = "장그래";
		s2.showInfo();
		
		// 인스턴스 출력
		// 패키지이름.클래스이름
		System.out.println(s1);
		System.out.println(s2);



	}

}
