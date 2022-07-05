package interfaceex.remotecontrol;

public class SmartTVTest {

	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
		
		// 구현 객체(tv)를 인터페이스 타입에 대입
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		rc.turnOn();
		searchable.search("www.naver.com");
		rc.turnOff();

	}

}
