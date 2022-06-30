package arrayObject;

public class ShellowCopy {

	public static void main(String[] args) {
		
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("혼공 자바", "신용권");
		array1[1] = new Book("반응형 웹", "조혜경");
		array1[2] = new Book("스프링부트", "채규태");
		
		// array2 기본생성자로 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		// array1을 array2에 복사
		for(int i=0;i<array1.length;i++) {
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setAuthor(array1[i].getAuthor());
		}
		
		array1[1].setBookName("미생");
		array1[1].setAuthor("윤태호");

		for(int i=0;i<array1.length;i++) {
			array1[i].showInfo();
		}
		
		for(int i=0;i<array1.length;i++) {
			array2[i].showInfo();
		}

	}

}
