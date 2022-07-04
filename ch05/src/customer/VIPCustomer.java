package customer;

public class VIPCustomer extends Customer{
	// 필드
	private int agentID;		// 상담원 ID
	private double saleRatio;	// 구매 할인율
	
	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;		// 5%
		saleRatio = 0.1;		// 10%
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// Customer 필드 상속
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		// 가격 = 가격 - (가격 X 구매할인율)
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n담당 상담원 아이디는 " + agentID + "입니다.";
	}
	
	
}
