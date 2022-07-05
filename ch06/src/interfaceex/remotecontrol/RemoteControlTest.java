package interfaceex.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rcTV = new Television();
		RemoteControl rcAudio = new Audio();
		
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.setVolume(12);	// 최대 볼륨 10
		rcTV.setMute(true);
		rcTV.setMute(false);
		RemoteControl.changeBattery();
		rcTV.turnOff();
		
		System.out.println("===================");
		
		rcAudio.turnOn();
		rcAudio.setVolume(5);
		rcAudio.setVolume(-3);	// 최소 볼륨 0
		rcAudio.setMute(true);
		rcAudio.setMute(false);
		RemoteControl.changeBattery();
		rcAudio.turnOff();

	}

}
