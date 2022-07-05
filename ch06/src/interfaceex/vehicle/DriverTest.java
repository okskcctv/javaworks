package interfaceex.vehicle;

public class DriverTest {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		// Bus bus = new Bus();
		// Taxi taxi = new Taxi();
		
		// 인터페이스형 타입으로 객체 생성
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}

}
