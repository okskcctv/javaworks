package Seats;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 좌석배치
		Scanner sc = new Scanner(System.in);
		int i, j;
		int rowNum, colNum;
		int people;
		
		System.out.print("입장객 수 입력: ");
		people = sc.nextInt();
		System.out.print("좌석 열의 수: ");
		rowNum = sc.nextInt();
		colNum = people / rowNum;
		for(i=0;i<colNum;i++) {
			for(j=1;j<=rowNum;j++) {
				if(i*colNum+j > people)
					break;
				System.out.printf("좌석%d", i * colNum + j);
				if(j<rowNum)
					System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
