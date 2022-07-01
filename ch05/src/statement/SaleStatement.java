package statement;

public class SaleStatement {

	public static void main(String[] args) {
		
		Drink coffee = new Drink("커피", 2500, 10);
		Drink tea = new Drink("녹차", 3000, 4);
		Drink soju = new Alcohol("소주", 4000, 5, 15.4F);
		
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		
		Alcohol.printTitle();
		soju.printData();
		/* soju.setAlcper(16.0f);
		soju.printData(); */
		
		int sum = coffee.getTotalPrice() + tea.getTotalPrice() + soju.getTotalPrice();
		System.out.printf("총액은 %,d원입니다.", sum);
		
	}

}
