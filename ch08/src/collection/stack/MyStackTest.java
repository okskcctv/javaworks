package collection.stack;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		// 객체 넣기
		stack.push("봄");
		stack.push("여름");
		stack.push("갈!");
		stack.push("겨울");
		
		// 객체 빼기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
