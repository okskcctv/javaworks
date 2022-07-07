package object;

public class EqualsTest {

	public static void main(String[] args) {
		// String으로 생성한 인스턴스의 메모리 주소와 값 비교
		String color1 = new String("빨강");
		String color2 = new String("빨강");
		System.out.println(color1==color2);			// 메모리 주소는 다르다.
		System.out.println(color1.equals(color2));	// 저장된 값은 같다.
		
		// Book으로 생성한 인스턴스의 메모리 주소와 값 비교
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "개미");
		Book book3 = new Book(101, "개미");
		Book book4 = new Book(100, "개");
		System.out.println(book1==book2);
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book3));
		System.out.println(book1.equals(book4));
		
		// color1, color2 해쉬코드 비교
		System.out.println(color1.hashCode());
		System.out.println(color2.hashCode());
		
		// book1, book2 해쉬코드 비교
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book3.hashCode());
		System.out.println(book4.hashCode());
	}

}
