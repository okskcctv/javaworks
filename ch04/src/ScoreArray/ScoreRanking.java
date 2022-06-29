package ScoreArray;

public class ScoreRanking {

	public static void main(String[] args) {
		// 순위 정하기
		int[] score = {80, 90, 74, 100, 50};
		int[] rank = new int[5];
		
		for(int i=0;i<score.length;i++) {
			int count = 1;
			for(int j=0;j<score.length;j++) {
				if(score[i] < score[j]) {
					count++;
				}
				rank[i] = count;
			}
		}
		
		for(int i=0;i<rank.length;i++) {
			System.out.printf("%d는 %d등\n", score[i], rank[i]);
		}

	}

}
