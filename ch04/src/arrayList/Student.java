package arrayList;

import java.util.ArrayList;
import Reference.Subject;

public class Student {
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);		// arryList에 저장
	}
	
	// 학생 및 과목 정보 출력
	public void showStudentInfo() {
		// 총합
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0;i<subjectList.size();i++) {
			Subject subject = subjectList.get(i);
			System.out.println("학생 " + studentName + "의 " + 
					subject.getSubjectName() + " 성적은 " + 
					subject.getScorePoint() + "입니다.");
			sum += subject.getScorePoint();
			
		}
		
		avg = (double)sum / subjectList.size();
		System.out.printf("학생 %s의 총점은 %d, 평균은 %.1f입니다.\n", studentName, sum, avg);
		
	}
	
}
