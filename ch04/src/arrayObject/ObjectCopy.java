package arrayObject;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("혼공 자바", "신용권");
		array1[1] = new Book("반응형 웹", "조혜경");
		array1[2] = new Book("스프링부트", "채규태");
		
		// array1을 array2에 복사
		/* for(int i=0;i<array1.length;i++) {
			array2[i] = array1[i];
		} */
		
		System.arraycopy(array1, 0, array2, 0, 3);

		for(int i=0;i<array1.length;i++) {
			array2[i].showInfo();
		}

	}

}
