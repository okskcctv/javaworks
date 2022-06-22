package type;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형
		// char 자료형은 2byte 이다
		char ch1 = 'A'; // 문자형 변수 char 'A'
		System.out.println(ch1);
		System.out.println((int)ch1); // 65
		
		char ch2 = 66;
		System.out.println(ch2);
		
		System.out.println("***** 유니코드 *****");
		
		char uniCode = '한'; // 한글자 이므로 홑따옴표
		System.out.println(uniCode);
		
		char uniCode2 = '\uD55C';
		System.out.println(uniCode2);
		
		// 영어 소문자 출력
		for(char c = 97; c < 123; c++) {
			System.out.print(c + " ");
		}
	}

}
