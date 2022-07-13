package generic.product;

public class GenericProduct {

	public static void main(String[] args) {
		// <클래스, 문자열> 타입
		Product<TV, String> prod1 = new Product<>();
		TV tv = new TV();
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		String tvModel = prod1.getModel();
		tv.making();
		System.out.println("모델: " + tvModel);
		
		// <클래스, 문자열> 타입
		Product<Car, String> prod2 = new Product<>();
		Car car = new Car();
		prod2.setKind(car);
		prod2.setModel("전기차");
		car.making();
		System.out.println("모델: " + prod2.getModel());
	}

}
