package Classpart;

public class StudentTest {

	public static void main(String[] args) {
		// 클래스의 객체 사용
		Student std1 = new Student();
		Student std2 = new Student();
		
		// std1 필드에 접근(점 연산자 사용)
		std1.studentID = 100;
		std1.studentName = "다있소";
		
		std2.studentID = 101;
		std2.studentName = "장그래";
		
		System.out.printf("학번 : %d\n", std1.studentID);
		System.out.printf("이름 : %s\n", std1.studentName);
		
		System.out.printf("학번 : %d\n", std2.studentID);
		System.out.printf("이름 : %s\n", std2.studentName);
		

	}

}
