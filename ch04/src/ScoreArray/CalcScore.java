package ScoreArray;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			try {
				System.out.println("--------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("--------------------------------------------");
				System.out.println("선택>");
				
				int selectNo = Integer.parseInt(sc.nextLine());
				
				switch(selectNo) {
				case 1:
					System.out.print("학생수>");
					studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
					break;
				case 2:
					for(int i=0;i<scores.length;i++) {
						System.out.print("scores[" + i + "]>");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
					break;
				case 3:
					for(int i=0;i<scores.length;i++) {
						System.out.println("scores[" + i + "]>" + scores[i]);
					}
					break;
				case 4:
					int max = scores[0];
					int sumV = 0;
					double avg = 0.0;
					
					for(int i=0;i<scores.length;i++) {
						sumV += scores[i];
						max = (max < scores[i]) ? scores[i] : max;
					}
					avg = (double)sumV / scores.length;
					System.out.println("최고 점수: " + max);
					System.out.println("평균 점수: " + avg);
					break;
				case 5:
					run = false;
					break;
				default:
					System.out.println("지원되지 않는 기능입니다. 다시 선택하세요");
				}
			}catch(Exception e) {
				System.out.println("올바른 선택이 아닙니다. 다시 선택하세요");
			}
		} // while 닫기
		System.out.println("프로그램 종효");
		sc.close();
	}

}
