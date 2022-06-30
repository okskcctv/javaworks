package arrayObject;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] libray = new Book[3];
		
		
		for(int i=0;i<libray.length;i++) {
			System.out.println(libray[i]);
		}
		
		libray[0] = new Book("혼공 자바", "신용권");
		libray[1] = new Book("반응형 웹", "나잘난");
		libray[2] = new Book("스프링부트", "이강산");
		
		libray[0].showInfo();
		
		for(Book book : libray) {
			book.showInfo();
		}

		libray[0].setBookName("혼자 공부하는 자바");
		libray[1].setAuthor("김광수");
		
		for(Book book : libray) {
			book.showInfo();
		}
		
	}

}
