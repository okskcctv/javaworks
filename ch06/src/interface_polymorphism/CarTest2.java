package interface_polymorphism;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car2 myCar = new Car2();
		myCar.run();
		
		myCar.tires2[0] = new KumTire();
		myCar.tires2[1] = new KumTire();
		myCar.run();
	}

}
