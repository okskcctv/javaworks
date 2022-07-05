package interfaceex.remotecontrol;

public class MyClassTest {

	public static void main(String[] args) {
		
		// 1. 필드 사용
		System.out.println("========================");
		MyClass myclass = new MyClass();
		myclass.rc.turnOn();
		myclass.rc.setVolume(5);

		// 2. 생성자 사용
		System.out.println("========================");
		MyClass myclass2 = new MyClass(new Audio());

		// 3. 메서드의 로컬 변수(지역 변수)
		System.out.println("========================");
		MyClass myclass3 = new MyClass();
		myclass3.methodA();
		
		// 4. 메서드의 매개 변수
		System.out.println("========================");
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Audio());
		
	}

}
