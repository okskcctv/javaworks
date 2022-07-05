package abstractex.shop;

public class ShopMain {

	public static void main(String[] args) {
		
		HeadShop shop1 = new Shop1();
		shop1.sellDoenjangJJige();
		shop1.sellKimchiJJige();
		shop1.sellBibimBap();
		System.out.println("====================");
		
		HeadShop shop2 = new Shop2();
		shop2.sellDoenjangJJige();
		shop2.sellKimchiJJige();
		shop2.sellBibimBap();
		System.out.println("====================");

	}

}
