package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// StringBuilder는 내부의 변경 가능한 char[] 변수를 가지고 있다.
		// 추가 메모리를 사용하지 않음
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		// 문자열 추가 -> 연결
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		//String 클래스 형으로 반환
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연산 후 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
	}

}
