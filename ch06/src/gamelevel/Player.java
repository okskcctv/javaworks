package gamelevel;

public class Player {
	// PlayerLevel 클래스 참조
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel level) {	// 매개변수의 다형성
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {	// 템플릿 메서드 호출
		level.go(count);
	}
}
