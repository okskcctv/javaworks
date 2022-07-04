package customer;

public class Customer {
	// 맴버
	private int customerID;				// 고객 아이디
	private String customerName;		// 고객 이름
	protected String customerGrade;		// 고객 등급
	protected int bonusPoint;			// 보너스 포인트
	protected double bonusRatio;		// 보너스 적립율
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;		// 1%
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	// 매서드
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int calcPrice(int price) {
		// 보너스 포인트 = 가격 X 보너스 적립율
		// bonusPoint 기본적으로 0으로 초기화 됨
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "
				+ bonusPoint + "점 입니다.";
	}
	
}
