package BuiltInClass;

public class MathRandomEx {

	public static void main(String[] args) {
		System.out.println("=== 주사위 10번 던지기 ===");
		for(int i=1; i<11; i++) {
			int dice = (int)(Math.random()*6) + 1;
			System.out.printf("%d ", dice);
		}
		System.out.println();
		
		System.out.println("=== 문자열 랜덤하게 뽑아내기 ===");
		String[] word = {"나", "너", "우리", "세계", "우주"};
		int rnd = (int)(Math.random()*word.length);
		System.out.println(word[rnd]);
		
		
	}

}
