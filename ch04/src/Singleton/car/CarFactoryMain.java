package Singleton.car;

public class CarFactoryMain {

	public static void main(String[] args) {
		// 자동차 공장 가동
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car herSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		System.out.println(herSonata.getCarNum());

	}

}
