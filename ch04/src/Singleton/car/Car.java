package Singleton.car;

public class Car {
	// 차의 고유번호 증가
	private static int serialNum = 10000; // 고유번호
	private int carNum;
	
	public Car() {
		carNum = ++serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}

}
