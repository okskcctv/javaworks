package collection.stack;

import java.util.ArrayList;

// Coin을 관리할 DAO
public class MyStack {
	private ArrayList<String> arrayStack;
	
	public MyStack() {
		arrayStack = new ArrayList<>();
	}
	
	// 자료 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// 자료 삭제
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len-1);
	}
}
