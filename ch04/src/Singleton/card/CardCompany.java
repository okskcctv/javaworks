package Singleton.card;

public class CardCompany {

	private static CardCompany instance;
	
	private CardCompany() {}
	
	// 외부에서 카드 컴퍼니를 사용할수 있도록 만든 메서드
	public static CardCompany getInstance() {
		if(instance == null)
			instance = new CardCompany();
		return instance;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
