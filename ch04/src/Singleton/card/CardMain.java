package Singleton.card;

public class CardMain {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		
		Card card1 = company.createCard();
		System.out.printf("card: %d\n",card1.getCardNumber());
		
		Card card2 = company.createCard();
		System.out.printf("card: %d\n",card2.getCardNumber());
		
		Card card3 = company.createCard();
		System.out.printf("card: %d\n",card3.getCardNumber());

	}

}
