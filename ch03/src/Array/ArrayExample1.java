package Array;

public class ArrayExample1 {

	public static void main(String[] args) {
		// 배열의 선언
		// 변수를 사용 - 3명의 학생의 국어, 수학점수
		/* int std1KorScore = 70;
		int std2KorScore = 80;
		int std3KorScore = 90;
		
		int std1MathScore = 80;
		int std2MathScore = 90;
		int std3MathScore = 100; */
		
		// 배열을 이용하여
		/* int[] korScore = new int[3];
		korScore[0] = 70;		
		korScore[1] = 80;		
		korScore[2] = 90; */
		
		// 선언과 동시에 초기화
		// int[] korScore = new int[] {70, 80, 90};
		int[] korScore = {70, 80, 90};
		
		System.out.printf("%d개\n", korScore.length);
		System.out.printf("%d\n", korScore[1]);
		
		korScore[2] = 95;
		System.out.printf("%d\n", korScore[2]);
		
		// 전체조회
		System.out.println(korScore);
		
		for(int i=0; i<korScore.length; i++) {
			System.out.printf("%d ", korScore[i]);
		}

	}

}
