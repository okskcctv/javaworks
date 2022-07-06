package exception;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("연결 완료");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}

}
