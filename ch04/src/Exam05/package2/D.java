package Exam05.package2;	// A와 패키지가 다름

import Exam05.package1.A;

public class D extends A{	// A와 상속 관계
	public D() {
		super();
		field1 = 1;
		// field2 = 1; // default 접근 불가
		// field3 = 1; // private 접근 불가
		field4 = 1;
		
		method1();
		// method2(); // default 접근 불가
		// method3(); // private 접근 불가
		method4();
	}
}
