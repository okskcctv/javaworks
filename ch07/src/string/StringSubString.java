package string;

public class StringSubString {

	public static void main(String[] args) {
		// subString(start, end) - start부터 end까지 문자 추출
		// subString(begin) - begin부터 끝까지 문자 추출
		String ssn = "991125-2345678";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
