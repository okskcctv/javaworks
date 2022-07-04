package customer;

public class CustomerTest {

	public static void main(String[] args) {
		// customer 객체 생성
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("이순신");
		
		// 상품 구매
		int price = 10000;
		customerLee.calcPrice(price);	// 100
		
		int price2 = 20000;
		customerLee.calcPrice(price2);	// 200
		
		// 고객 정보 출력
		System.out.println(customerLee.showCustomerInfo());

	}

}
