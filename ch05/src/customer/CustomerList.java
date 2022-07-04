package customer;

import java.util.ArrayList;

public class CustomerList {

	public static void main(String[] args) {
		// ArrayList 자료구조를 사용하기
		ArrayList<Customer> customerList = new ArrayList<>();
		
		// SILVER 2명 GOLD 2명 VIP 1명
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer you = new GoldCustomer(10040, "이율곡");
		Customer king = new VIPCustomer(10050, "세종대왕", 1446);
		
		// 자료 추가
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(you);
		customerList.add(king);
		
		System.out.println("========== 고객 정보 출력 ==========");
		for(int i=0;i<customerList.size();i++) {
			Customer customer = customerList.get(i);
			System.out.println(customer.showCustomerInfo());
		}
		/* for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		} */
		
		System.out.println("========== 할인율과 보너스 포인트 계산 ==========");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.printf("%s님이 %d원 지불하셨습니다\n", customer.getCustomerName(), cost);
			System.out.println(customer.showCustomerInfo());
		}

	}

}
