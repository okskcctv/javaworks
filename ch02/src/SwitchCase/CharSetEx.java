package SwitchCase;

public class CharSetEx {

	public static void main(String[] args) {
		// 문자 세트 (아스키코드 유니코드)
		char ch;
		for(ch=65; ch<123; ch++) {
			System.out.print(ch + " ");
		}
		
		System.out.println();
		// 한글
		for(ch=12593; ch<12686; ch++) {
			System.out.print(ch + " ");
		}
		
		System.out.println();
		// 구구단
		int dan = 6;
		for(int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
		
	}

}
