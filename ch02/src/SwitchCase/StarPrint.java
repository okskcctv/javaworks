package SwitchCase;

public class StarPrint {

	public static void main(String[] args) {
		// 삼각형 모양 별찍기
		int i, j;
		for(i=1; i<=5;i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1; i<=5;i++) {
			for(j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1; i<=5;i++) {
			for(j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1; i<=5;i++) {
			for(j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
