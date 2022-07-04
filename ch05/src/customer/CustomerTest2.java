package customer;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 고객 객체 생성
		Customer customerLee = new Customer(10010, "이순신");
		// VIPCustomer customerKing = new VIPCustomer(10020, "세종대왕", 1446);
		Customer customerKing = new VIPCustomer(10020, "세종대왕", 1446);
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kingPrice = customerKing.calcPrice(price);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKing.showCustomerInfo());
		
		System.out.println(customerLee.getCustomerName() + "님의 결제 금액은 " + leePrice);
		System.out.println(customerKing.getCustomerName() + "님의 결제 금액은 " + kingPrice);

	}

}
