package chap07;

public class Test7_2 {

	public static void main(String[] args) {
		// 1번 1.O 2.X 3.O 4.O
		
		// 2번
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		// 3번 2
		
		// 4번 1.X 2.O 3.O 4.O 5.X 6.X
		
		// 5번
		// 멤버 로그인
		// A 로그인
		
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new AService());
		controller.service.login();

	}

}



class Tire{
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class SnowTire extends Tire{
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}
