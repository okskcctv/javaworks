package interface_polymorphism;

public class Car2 {
	// 필드 - 인터페이스 타입으로 객체생성
	Tire[] tires = {
			new HanTire(),
			new HanTire(),
			new KumTire(),
			new KumTire()
	};
	
	Tire[] tires2 = new Tire[] {
			new HanTire(),
			new HanTire(),
			new KumTire(),
			new KumTire()
	};
	
	void run() {
		for(int i=0;i<tires.length;i++) {
			tires[i].roll();
		}
	}
}
