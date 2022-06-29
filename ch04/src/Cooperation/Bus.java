package Cooperation;

public class Bus {
	int busNumber;	// 버스 번호
	int passenger;	// 승객
	int money;		// 수익
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 사람을 태우는 매소드
	public void take(int money) {
		this.money += money;	// 수익 증가
		passenger++;			// 승객 수 증가
	}
	
	public void showInfo() {
		System.out.printf("%d번버스의 수익은 %,d원이며, 승객은 %d명 입니다.\n", busNumber, money, passenger);
	}

}
