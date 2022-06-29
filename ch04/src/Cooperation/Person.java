package Cooperation;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1200);
		money -= 1200;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1300);
		money -= 1300;
	}
	
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %,d입니다.\n", name, money);
	}
}
