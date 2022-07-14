package collection.stack;

import java.util.Stack;

public class StackCoinTest {
	
	public static void main(String[] args) {
		
		// dao 클래스 스택
		Stack<Coin> coinBox = new Stack<>();
		
		// 동전 객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		// 스택에서 동전 넣기(순서 : 500 - 100 - 50 - 10)
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin10);
		
		// 스택에서 동전 빼기
		// System.out.println(coinBox.pop().getValue());
		
		while(!coinBox.isEmpty()) {	// 서순 : 10 - 50 - 100 - 500
			Coin coin = coinBox.pop();
			System.out.println("꺼낸 동전 : " + coin.getValue() + "원");
		}
	}
}
