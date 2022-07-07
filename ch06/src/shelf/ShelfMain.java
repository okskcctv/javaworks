package shelf;

public class ShelfMain {

	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		
		// 자료 삽입
		shelfQueue.enQueue("반응형 웹");
		shelfQueue.enQueue("혼공 Java");
		shelfQueue.enQueue("스프링부트");
		
		
		// 자료의 개수
		System.out.println("현재 책의 개수 : " + shelfQueue.getSize());
		shelfQueue.getQueue();
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		shelfQueue.getQueue();
	}

}
