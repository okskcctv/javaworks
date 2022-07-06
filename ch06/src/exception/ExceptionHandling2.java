package exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			// e.printStackTrace();
			System.out.println(e);
		}
	}
}
