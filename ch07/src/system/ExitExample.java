package system;

public class ExitExample {

	public static void main(String[] args) {
		
		// 반복구문을 강제 종료
		// 현재 실행되는 프로세스 종료
		for(int i=0; i<10; i++) {
			if(i == 5) {	// i가 5일때 강제 종료
				System.exit(0);	// 정상 종료(프로세스가 완전히 종료됨)
				// break;
			}
			System.out.println(i);	// System.exit(0)에 의해 실행이 안됨
		}
		
		for(int i=0; i<10; i++) {
			if(i == 5) {	// i가 5일때 (for문)처음으로 돌아감
				continue;
			}
			System.out.println(i);
		}
	}

}
