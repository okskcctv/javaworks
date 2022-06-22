package Operator;

public class Operator2 {

	public static void main(String[] args) {
		// 증가 감소 연산자
		int num = 10;
		int val = 0;
		
//		val = num++; // val = num; num = num + 1;
		val = ++num;
		System.out.println(val);
		System.out.println(num);
		
//		val = num--;
		val = --num;
		System.out.println(val);
		System.out.println(num);
		
		// 산술 연산자 총점과 평균
		int mathScore = 90, engScore = 75;
		int totalScore;
		double avgScore;
		
		totalScore = mathScore + engScore;
		avgScore = (double)totalScore / 2;
		
		System.out.println(totalScore);
		System.out.println(avgScore);

	}

}
