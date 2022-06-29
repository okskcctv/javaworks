package Systemio;

public class PrintfExample {

	public static void main(String[] args) {
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int)(var1 + var2);
		
		System.out.println(result);
		
		byte valueB = Byte.parseByte("10");
		int valueI = Integer.parseInt("1000");
		float valueF = Float.parseFloat("20.5");
		double valueD = Double.parseDouble("3.14159");
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);

	}

}
