package shelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;
	// 상속시 접근 제어자
	
	public Shelf() { // 기본 생성시 ArrayList 생성
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
	
	
}
