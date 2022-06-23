package SwitchCase;

public class Sum1To10 {

	public static void main(String[] args) {
		
		int n = 0;
		int sum = 0;
		
		while(true) {
			sum += n++;
			if(n > 5)
				break;
		}
		System.out.println(sum);

	}

}
