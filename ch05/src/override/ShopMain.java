package override;

public class ShopMain {

	public static void main(String[] args) {
		
		/* HeadShop headShop = new HeadShop();
		
		System.out.println("본점입니다.");
		headShop.sellDoenjangJJige();
		headShop.sellKimchiJJige();
		headShop.sellBibimBap();
		System.out.println("========================"); */
		
		// Shop1 shop1 = new Shop1();
		HeadShop shop1 = new Shop1();
		
		shop1.sellDoenjangJJige();
		shop1.sellKimchiJJige();
		shop1.sellBibimBap();
		System.out.println("========================");

		Shop2 shop2 = new Shop2();
		
		shop2.sellDoenjangJJige();
		shop2.sellKimchiJJige();
		shop2.sellBibimBap();
		
		
	}

}
