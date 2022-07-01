package statement;

public class Drink {
	
	String name; 	//상품명
	int price;		// 가격
	int count;		// 수량
	
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		// 계산 = 가격 X 수량
		return price * count;
	}
	
	public static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	public void printData() {
		System.out.println(name + "\t" + price + "\t" + 
					count + "\t" + getTotalPrice());
	}
	
	public void setAlcper(float alcper) {
		
	}
	
}
