package string;

public class StringConcat {

	public static void main(String[] args) {
		// concat() - 문자열 연결하기
		
		String javaStr = new String("Java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("연산 전 주소" + System.identityHashCode(javaStr));
		System.out.println(javaStr.hashCode());
		
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr);
		System.out.println("연산 후 주소" + System.identityHashCode(javaStr));
		System.out.println(javaStr.hashCode());
	}

}
