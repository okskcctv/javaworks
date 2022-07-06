package nestedclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {
		int num = 10;	// 인터페이스 상수
		
		// 메서드의 내부 클래스로 사용
		class MyRunnable implements Runnable{
			int localNum = 20;
			
			@Override
			public void run() {
				// num = 20;
				System.out.println(outNum + "(외부클래스의 인스턴스 변수)");
				System.out.println(sNum + "(외부클래스의 정적 변수)");
				System.out.println(localNum + "(내부클래스의 멤버 변수)");
			}
		}
		MyRunnable myRun = new MyRunnable();
		return myRun;
		// return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
		
		System.out.println("*** 인터페이스형으로 변환 ***");
		Runnable runner = outer.getRunnable();
		runner.run();
	}

}
