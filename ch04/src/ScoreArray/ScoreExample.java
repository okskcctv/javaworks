package ScoreArray;

public class ScoreExample {

	public static void main(String[] args) {
		// 5명의 자바 과목 점수
		int[] score = {80, 90, 74, 100, 50};
		int sumScore = 0;
		double avgScore;
		int maxV = 0;
		
		// 총점
		for(int i=0;i<score.length;i++) {
			sumScore += score[i];
		}
		System.out.println(sumScore);
		
		// 평균
		avgScore = (double)sumScore / score.length;
		System.out.println(avgScore);
		
		// 최고 점수
		for(int i=0;i<score.length;i++) {
			if(maxV < score[i]) {
				maxV = score[i];
			}
		}
		System.out.println(maxV);
		
	}

}
