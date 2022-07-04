package customer;

public class GoldCustomer extends Customer{
	//필드
	private double saleRatio;	// 구매 할인율
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);	// Customer 필드 상속
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		// 가격 = 가격 - (가격 X 구매할인율)
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
}
