package abstractex.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// abstract는 객체 생성 불가능
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.powerOn();
		smartPhone.internetSearch();
		smartPhone.powerOff();

	}

}
