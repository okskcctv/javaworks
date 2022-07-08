package string;

public class StringIndexOf {

	public static void main(String[] args) {
		// indexOf("str") - 문자열이 시작되는 인덱스를 리턴함
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		// 문자열 검색
		if(subject.indexOf("자바") != -1) {
			// -1이 아니면 >=0 : 찾음
			System.out.println("자바와 관련된 책이군요!");
		}
		else {
			System.out.println("자바와 관련이 없는 책이군요!");
		}
	}

}
