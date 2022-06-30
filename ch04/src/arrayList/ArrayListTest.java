package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> cart = new ArrayList<>();
		
		
		cart.add("커피");
		cart.add("계란");
		cart.add("생수");
		
		System.out.println("장바구니 품목:" + cart.size() + "개");
		
		for(int i=0;i<cart.size();i++) {
			String c = cart.get(i);
			System.out.println(c);
		}
		
		System.out.println("=== 커피 삭제 ===");
		cart.remove(0);
		
		cart.set(0, "라면");
		
		for(String c : cart) {
			System.out.println(c);
		}

	}

}
