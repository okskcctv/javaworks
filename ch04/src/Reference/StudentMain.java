package Reference;

public class StudentMain {

	public static void main(String[] args) {
		Student lee = new Student(1001, "이양파");
		Student park = new Student(1002, "박마늘");
		
		lee.koreanSubject("국어", 90);
		lee.mathSubject("수학", 80);
		park.koreanSubject("국어", 80);
		park.mathSubject("수학", 75);
		
		lee.showInfo();
		park.showInfo();

	}

}
