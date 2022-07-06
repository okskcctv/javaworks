package nestedclass;

class OutClass{
	int num = 10;
	static int sNum = 20;
	
	// 정적 내부 클래스
	static class InClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// num = 20;		// 외부 클래스의 인스턴스 변수는 사용못함
			sNum = 30;
			System.out.println(sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println(inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println(sInNum + "(내부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() {
			// num = 30;	// 사용 못함
			// inNum = 10;	// 사용 못함
			System.out.println(sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println(sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
}


public class StaticInnerClass {

	public static void main(String[] args) {
		// 중첩 클래스의 객체 생성
		OutClass.InClass inClass = new OutClass.InClass();
		
		System.out.println("**정적 내부 클래스의 일반 메서드 호출**");
		inClass.inTest();
		
		System.out.println("**정적 내부 클래스의 정적 메서드 호출**");
		OutClass.InClass.sTest(); // 정적 변수이므로 클래스로 호출

	}

}
