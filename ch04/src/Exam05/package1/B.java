package Exam05.package1;	// A와 패키지가 동일

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1; // private 접근 불가
		a.field4 = 1;
		
		a.method1();
		a.method2();
		// a.method3(); // private 접근 불가
		a.method4();
	}
	
}
