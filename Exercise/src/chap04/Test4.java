package chap04;

public class Test4 {

	public static void main(String[] args) {
		int i; // 반복문을 위한 변수
		int y; // y값을 받기위한 변수
		
		for(i=1; i<=10; i++) { // x의 범위인 1~10 사이의 자연수 대입
			y = (60 - 4 * i) / 5; // y는 4x + 5y = 60 에서 나온 식
			if(y<=10 && y>0 && ((60 - 4 * i) % 5) == 0) // 0<y<=10 그리고 y가 자연수일때
			System.out.printf("(%d, %d)\n", i, y);
		}

	}

}
