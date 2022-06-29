package Singleton;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {} // new 막음(외부 객체 추가)
	
	// 자동차 공장 인스턴스
	public static CarFactory getInstance() {
		return instance;
	}
	
	// 차 제작
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
