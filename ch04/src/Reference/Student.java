package Reference;

public class Student {
	// field
	int studentID;	// 학번
	String studentName;	// 이름
	Subject korean;
	Subject math;
	
	// 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	// 메서드
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	public void showInfo() {
		System.out.printf("%s 학생의 %s점수는 %d입니다.\n", studentName, korean.getSubjectName(), korean.getScorePoint());
		System.out.printf("%s 학생의 %s점수는 %d입니다.\n", studentName, math.getSubjectName(), math.getScorePoint());
	}
}
