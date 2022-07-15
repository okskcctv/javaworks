package thread;

import java.awt.Toolkit;

public class BeepPrintTest3 {

	public static void main(String[] args) {
		// 메인 스레드와 작업 스레드가 동시에 실행
		// 익명 객체로 구현
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();	// 스레드 시작
		
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
