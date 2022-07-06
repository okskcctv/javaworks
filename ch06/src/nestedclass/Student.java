package nestedclass;

public class Student {
	
	
	String name;
	
	Student(String name){
		this.name = name;
	}
	
	// 성적 클래스
	class Score{
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("이름 : " + name);
			System.out.println("영어 점수 : " + eng);
			System.out.println("수학 점수 : " + math);
		}
	}

}
