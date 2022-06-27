package Classpart;

public class Student {
	// 필드(맴버 변수)
	int studentID;		// 학번
	String studentName;	// 이름
	int grade;			// 학년
	String address;		// 주소
	// 기본 생성자 - 초기, 생략가능
	// 함수는 아님 반환값이 없음
	Student(){
		
	}
	
	public void showInfo() { // 반환 자료형이 없는 함수
		System.out.printf("학번 : %d\n이름 : %s\n", studentID, studentName);
	}
}