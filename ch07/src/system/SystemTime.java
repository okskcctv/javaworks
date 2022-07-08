package system;

public class SystemTime {

	public static void main(String[] args) {
		
		// 수행 시간 측정
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();
		
		// 1부터 백만까지 더하기
		int sum = 0;
		for(int i=0; i<=1000000; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		long end2 = System.nanoTime();
		System.out.println(sum);
		System.out.println("밀리초: " + (end - start) + ", 나노초: " + (end2 - start2));
	}

}
