package Method;

public class OneUp {
	
	static int x = 1;
	// 1더하는 함수
	public static int oneup() {
		x += 1;
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("num = %d\n", oneup());
		System.out.printf("num = %d\n", oneup());
		System.out.printf("num = %d\n", oneup());

	}

}
