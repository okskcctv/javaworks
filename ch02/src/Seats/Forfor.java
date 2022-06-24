package Seats;

public class Forfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i=0;i<5;i++) {
			for(j=1;j<=5;j++) {
				System.out.printf("%d",i*5 + j);
				if(j<5)
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
