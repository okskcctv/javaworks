package exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
		// Null 오류
		/*
		String data = null;
		System.out.println(data.toString()); // NullPointerException 발생
		*/
		
		// 배열의 크기 오류
		int[] num = new int[2];
		
		num[0] = 1;
		num[1] = 2;
		// num[2] = 3;
		
		// ArrayIndexOutOfBoundsException 발생
		System.out.println("완료");
		
		// 데이터 포맷(형) 오류
		/*
		String data1 = "100";
		String data2 = "a200";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); // NumberFormatException 발생
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		*/
	}

}
