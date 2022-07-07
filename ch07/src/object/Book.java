package object;

public class Book {
	// 필드
	int bookNumber;		// 책 번호
	String bookTitle;	// 책 제목
	
	// 생성자
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	void showInfo() {
		System.out.println(bookNumber + ", " + bookTitle);
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;	// 강제 타입 변환
			if(this.bookNumber == book.bookNumber)
				if(this.bookTitle.equals(book.bookTitle))
					return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return bookNumber + bookTitle.hashCode();
	}
}
