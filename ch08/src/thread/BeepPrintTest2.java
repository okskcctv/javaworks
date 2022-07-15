package thread;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		// 메인 스레드와 작업 스레드가 동시에 실행
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();	// 스레드 시작(실행
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
