package SwitchCase;

public class ForEx {

	public static void main(String[] args) {
		// 중첩된 for문
		int i, j;
		for(i=1; i<=5;i++) {
			for(j=1; j<=5; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		for(i=1; i<=5;i++) {
			for(j=1; j<=5; j++) {
				System.out.print("가");
			}
			System.out.println();
		}

	}

}
