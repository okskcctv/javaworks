package Method;

class hello{
	public void sayHello() {
		System.out.println("Hello Java");
	}
}

public class SayHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hello hello = new hello();
		hello.sayHello();
		
		// 함수 호출
		// 함수 오버로딩 : 함수 이름이 같아도 매개변수와 자료형이 다르면 사용 가능
		sayHello();
		sayHello("민수");
		sayHello("sooyoung");
	}
	
	// 함수 정의
	// static을 사용하는 이유는 (class)객체생성을 하지 않을때 사용한다
	// 매개변수가 없는 함수
	public static void sayHello() {
		System.out.println("Hello Java");
	}
	
	// 매개변수가 있는 함수
	public static void sayHello(String name) {
		System.out.printf("Hello %s\n", name);
	}

}
