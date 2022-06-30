package arrayList;

import java.util.ArrayList;

import arrayObject.Book;

public class BookList {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		
		Book book1 = new Book("혼공 자바", "신용권");
		Book book2 = new Book("반응형 웹", "나잘난");
		Book book3 = new Book("스프링부트", "이강산");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		for(int i=0;i<bookList.size();i++) {
			Book book = bookList.get(i);
			book.showInfo();
		}

	}

}
