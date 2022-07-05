package template_method;

public abstract class Car {

	// 추상 메서드
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드 - final로 하면 재정의 할 수 없음
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
