package interface_polymorphism;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire = new KumTire();
		myCar.frontRightTire = new KumTire();
		myCar.run();
	}

}
