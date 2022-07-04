package chap06;

public class ShopService {
	public static ShopService shopService = new ShopService();
	
	public static ShopService getInstance() {
		return shopService;
	}
}
