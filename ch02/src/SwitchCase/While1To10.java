package SwitchCase;

public class While1To10 {

	public static void main(String[] args) {
		
		int n = 0;
//		while(n <10) {
//			n++;
//			System.out.println(n);
//		}
		
		while(true) {
			n++;
			System.out.println(n);
			if(n > 10)
				break;
			System.out.println(n);
		}
	}

}
