package polymorphism.fruit;

public class Fruit {
	String name;	// 과일 이름
	String weight;	// 무게
	int price;		// 가격
	
	public Fruit() {}	// 생성자
	
	public void showInfo() {
		System.out.println("과일 이름 : " + name);
		System.out.println("과일 무게 : " + weight);
		System.out.println("과일 가격 : " + price);
	}
}
