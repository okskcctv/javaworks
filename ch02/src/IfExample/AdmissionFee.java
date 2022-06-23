package IfExample;

public class AdmissionFee {

	public static void main(String[] args) {
		int age = 9;
		int fee; // 입장료(요금)
		
		if(age < 8) {
			fee = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if(age < 14) {
			fee = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age < 20) {
			fee = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			fee = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.printf("입장료는 %,d원입니다.", fee);
	}

}
