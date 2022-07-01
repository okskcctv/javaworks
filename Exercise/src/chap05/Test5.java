package chap05;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]>", i);
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}
			else if(selectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			}
			else if(selectNo == 4) {
				int sum = 0;
				int highScore = 0;
				for(int i=0; i<studentNum; i++) {
					sum += scores[i];
					if(highScore < scores[i])
						highScore = scores[i];
				}
				System.out.printf("최고 점수: %d\n", highScore);
				System.out.printf("평균 점수: %f\n", (double)sum / studentNum);
			}
			else if(selectNo == 5) {
				run = false;
			}
			else {
				
			}
			
		}
		
		System.out.println("프로그램 종료");
		sc.close();

	}

}
