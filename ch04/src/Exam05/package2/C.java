package Exam05.package2;	// A와 패키지가 다름

import Exam05.package1.A;

public class C {
	public C(){
		A a = new A();
		a.field1 = 1;
		// a.field2 = 1; // default 접근 불가
		// a.field3 = 1; // private 접근 불가
		// a.field4 = 1; // protected 접근 불가
		
		a.method1();
		// a.method2(); // default 접근 불가
		// a.method3(); // private 접근 불가
		// a.method4(); // protected 접근 불가
	}
}
