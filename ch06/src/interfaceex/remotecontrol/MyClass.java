package interfaceex.remotecontrol;

public class MyClass {
	// 핃드
	RemoteControl rc = new Television();
	
	// 기본 생성자
	public MyClass() {}
	
	// 생성자의 매개 변수
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		// 지역 변수
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
}
