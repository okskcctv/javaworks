package arrayList;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1001, "이양파");
		Student s2 = new Student(1002, "박마늘");
		
		s1.addSubject("국어", 95);
		s1.addSubject("수학", 80);
		
		s2.addSubject("java", 70);
		s2.addSubject("javascript", 85);
		
		s1.showStudentInfo();
		s2.showStudentInfo();

	}

}
