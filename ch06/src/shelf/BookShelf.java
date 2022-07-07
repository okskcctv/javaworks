package shelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	
	@Override
	public int getSize() {
		return getCount();
	}
	
	@Override
	public void getQueue() {
		for(int i=0; i<shelf.size();i++) {
			System.out.println(shelf.get(i));
		}
	}
}
