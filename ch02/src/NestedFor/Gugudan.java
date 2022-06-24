package NestedFor;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan, times;
		
		for(dan=2;dan<=9;dan++) {
			for(times=1;times<=9;times++) {
				System.out.printf("%d X %d = %d", dan, times, dan * times);
				if(times<9)
					System.out.print(", ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(times=1;times<=9;times++) {
			for(dan=2;dan<=9;dan++) {
				System.out.printf("%d X %d = %d", dan, times, dan * times);
				if(dan<9)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
