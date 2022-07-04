package taketrans;

public class Student {
	
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 요금을 내고 교통 수단을 이용하기(다형성)
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);
		this.money -= fee;
	}
	
	public void showInfo() {
		System.out.printf("%s의 남은 돈은 %,d원입니다.\n", name, money);
	}

}
