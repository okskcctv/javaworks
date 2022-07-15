package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	// Runnable 인터페이스를 구현한 BeepTask 클래스 생성
	// 비프음을 재생하는 작업 정의
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
}
