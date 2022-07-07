package object;

public class ToStringExample {

	public static void main(String[] args) {
		// toString 매서드 객체의 정보를 문자열로 출력하는 함수
		// String의 name 객체
		String name = new String("오상식");
		System.out.println(name);
		
		System.out.println(name.toString());
		
		Book book = new Book(12, "개미");
		System.out.println(book);
		System.out.println(book.toString());
	}

}
