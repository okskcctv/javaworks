package statement;

public class Alcohol extends Drink{
	
	float alcper;	// 알콜 도수
	
	Alcohol(String name, int price, int count, float alcper){
		super(name, price, count);
		this.alcper = alcper;
	}
	
	// static 메서드는 override를 붙이지 않는다
	// 재정의는 객체가 생성될때 작동하므로 static은 객체 생성이 아니므로 override가 동작안함
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}
	
	@Override
	public void printData() {
		System.out.println(name + "(" + alcper + ")\t" + price + "\t" + 
				count + "\t" + getTotalPrice());
	}
	
	@Override
	public void setAlcper(float alcper) {
		this.alcper = alcper;
	}

}
