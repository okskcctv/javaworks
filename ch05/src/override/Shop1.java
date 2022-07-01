package override;

public class Shop1 extends HeadShop {

	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}
	
	// 매서드 재정의
	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌게 : 6,000원");
	}
	
	@Override
	public void sellKimchiJJige() {
		System.out.println("김치찌게 : 6,500원");
	}
	
	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥 : 7,000원");
	}
}
