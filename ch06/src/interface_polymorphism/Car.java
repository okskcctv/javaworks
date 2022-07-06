package interface_polymorphism;

public class Car {
	// 필드 - 인터페이스 타입으로 객체생성
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new KumTire();
	Tire backLeftTire = new HanTire();
	Tire backRightTire = new KumTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
