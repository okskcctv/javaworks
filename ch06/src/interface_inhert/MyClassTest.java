package interface_inhert;

public class MyClassTest {
	public static void main(String[] args) {
		// myclass 객체 생성
		MyClass myClass = new MyClass();
		
		X x = myClass;	// 자동 형변환
		x.x();
		
		Y y = myClass;
		y.y();
		
		System.out.println("*** 다음부턴 iClass 사용 ***");
		MyInterface iClass = myClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
		System.out.println("*** 강제 형변환 ***");
		((MyClass)x).myMethod();
		((MyClass)y).myMethod();
	}

}
