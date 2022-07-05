package template_method;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("==== 사람이 운전하는 자동차 ====");
		Car manual = new ManualCar();
		manual.run();
		
		System.out.println("==== 인공지능이 운전하는 자동차 ====");
		Car ai = new AICar();
		ai.run();

	}

}
