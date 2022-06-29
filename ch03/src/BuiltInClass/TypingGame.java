package BuiltInClass;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] words = {"river", "mountain", "sky", "earth", "moon", 
				"tree", "flower", "cow", "pig", "horse"};
		int n = 1;
		long start, end;
		boolean correct = false; // 같은단어 반복을 위한 변수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어타자 게임, 준비되면 엔터");
		sc.nextLine();
		start = System.currentTimeMillis();
		while(n<11) {
			correct = false; // 초기화
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제" + n);
			String question = words[rand];
			
			while(!correct) {
				System.out.println(question); // 문제 표시
				String answer = sc.nextLine();
				if(answer.equals(question)) {
					System.out.println("통과!");
					n++;
					correct = true;
				}
				else {
					System.out.println("오타! 다시 도전!");
				}
			}
		}
		end = System.currentTimeMillis();
		System.out.println("게임 소요 시간은 " + (end-start)/1000 + "초입니다.");
		sc.close();
	}

}