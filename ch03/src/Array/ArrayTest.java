package Array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] num = new int[] {90, 80, 100, 75, 95};
		
		String[] str = new String[] {"사과", "참외", "수박"};
		
		Product[] product = new Product[3];
		product[0] = new Product("스마트폰", 100000);
		product[1] = new Product("아이팟", 200000);
		product[2] = new Product("아이폰", 300000);
		
		for(int i=0;i<product.length;i++) {
			System.out.println(product[i].showInfo());
		}
		
		for(Product p : product) {
			System.out.println(p.showInfo());
		}

	}

}
