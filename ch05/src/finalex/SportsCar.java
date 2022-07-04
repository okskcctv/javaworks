package finalex;

public class SportsCar extends Car{
	@Override
	public void speedUp() {speed += 10;}
	
	/* @Override
	public void stop() { // 재정의 할 수 없음
		System.out.println("스포츠카를 멈충");
		speed = 0;
	} */
}
