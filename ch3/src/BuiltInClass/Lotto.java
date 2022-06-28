package BuiltInClass;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int i, j;
		System.out.println(lotto.length);
		int n =0;
		int count = 0;
		
		while(n<3) { // 중복 번호 동시에 3번 뜰때까지
			n = 0; // 동시에 3번 뜨지 않으면 초기화
			count++; // 시행 횟수 확인
			for(i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45) + 1;
				for(j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						System.out.printf("중복 번호 : %d\n", lotto[i]);
						i--;
						n++;
					}
				}
				
			}
		}
		
		for(i=0; i<lotto.length; i++) { // 배열 정렬을 위한 for문
			for(j=0; j<i; j++) {
				if(lotto[i] < lotto[j]) { // 고정된 쪽이 작을때 바꿔야 왼쪽으로 감(왼쪽부터 비교하기 때문)
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(i=0; i<lotto.length; i++) {
			System.out.printf("%d", lotto[i]);
			if(i<lotto.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println(count);

	}

}
