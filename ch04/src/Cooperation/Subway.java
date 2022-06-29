package Cooperation;

public class Subway {
	String lineNumber;
	int passenger;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showInfo() {
		System.out.printf("%s의 수익은 %,d원이며, 승객은 %d명 입니다.\n", lineNumber, money, passenger);
	}

}
