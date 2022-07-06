package nestedclass;

public class StudentTest {

	public static void main(String[] args) {
		// 외부 클래스 객체 생성
		Student jang = new Student("장그래");
		
		// 내부 클래스 객체 생성
		Student.Score score = jang.new Score();
		
		score.eng = 88;
		score.math = 73;
		score.showInfo();
	}

}
