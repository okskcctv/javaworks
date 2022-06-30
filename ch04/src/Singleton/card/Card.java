package Singleton.card;

public class Card {
	// 필드
	private int cardNumber;	// 카드번호
	private static int serialNum = 1000;
	
	public Card () {
		cardNumber = ++serialNum;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
}