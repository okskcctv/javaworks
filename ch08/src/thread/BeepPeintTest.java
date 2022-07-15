package thread;

import java.awt.Toolkit;

public class BeepPeintTest {

	public static void main(String[] args) {
		// 메인 스레드만 실행
		// "땅" 문자를 5번 출력하기 -> 1초 대기 간격
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);	// 1000ms -> 1s(1초)
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// "띵" 소리르 5번 재생하기
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
