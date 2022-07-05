package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump는 아직 안배웠어");
	}

	@Override
	public void turn() {
		System.out.println("turn은 아직 몰라");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****초보자 레벨입니다.*****");
	}

}
