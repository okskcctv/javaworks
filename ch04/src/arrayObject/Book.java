package arrayObject;

public class Book {
	// 필드, 맴버 변수
	private String bookName;	// 제목
	private String author;		// 작가
	
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void showInfo() {
		System.out.printf("책 제목은 %s, 작가는 %s 입니다.\n", bookName, author);
	}
}
