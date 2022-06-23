package IfExample;

public class LimitSpeed2 {

	public static void main(String[] args) {
		// 자동차 제한속도
		int limitSpeed = 55;
		
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반!! 과태료 10만원 부과 대상");
		}
		else {
			
		}
		
		// 출력
		System.out.printf("현재 %dkm입니다.", limitSpeed);
		
	}
}
