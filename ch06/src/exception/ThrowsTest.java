package exception;

class ArrayUtil{
	public void call() throws Exception {
		System.out.println("call 매서드 시작");
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		System.out.println("call 매서드 종료");
	}
}



public class ThrowsTest {

	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		try {
			util.call();
			System.out.print("Hello");
		}catch(Exception e) {
			System.out.println("main 매서드에서 예외 처리");
		}
		System.out.println(" World");
	}

}
