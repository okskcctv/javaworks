package BuiltInClass;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스
		// Math는 static 함수이기 때문에 new로 호출할 필요가 없음
		int v1 = Math.abs(-10);		// 절댓값
		System.out.printf("v1 = %d\n", v1);
		
		long v2 = Math.round(5.6);	// 반올림
		System.out.println("v2 = " + v2);
		
		double v3 = Math.floor(5.9);	// 버림
		System.out.println("v3 = " + v3);
		
		int max = Math.max(10, 20);		// 최대값
		System.out.printf("max = %d\n", max);
		
		double rand = Math.random();
		System.out.println("rand = " + rand); // 난수 값 0.0 <= rand < 1.0
		
		int dice = (int)(Math.random()*6) + 1;
		System.out.printf("주사위 눈 : %d\n", dice);
		
	}

}
