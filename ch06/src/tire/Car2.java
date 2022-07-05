package tire;

public class Car2 {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	boolean fLR = true;
	boolean fRR = true;
	boolean bLR = true;
	boolean bRR = true;
	// 생성자
	// 메소드
	boolean[] run() {
		System.out.println("[자동차가 달립니다.]");
		fLR = frontLeftTire.roll();
		fRR = frontRightTire.roll();
		bLR = backLeftTire.roll();
		bRR = backRightTire.roll();
		if(!fLR || !fRR || !bLR || !bRR) {
			stop();
		}
		return new boolean[] {fLR, fRR, bLR, bRR};
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
