package tire;

public class CarExample2 {

	public static void main(String[] args) {
		Car2 car = new Car2();
		
		for(int i=1; i<=5; i++) {
			boolean[] problemLocation = car.run();
			
			for(int j=0; j<problemLocation.length; j++) {
				if(problemLocation[j] == false) {
					switch(j) {
					case 0:
						System.out.println("앞왼쪽 HankookTire로 교체");
						car.frontLeftTire = new HankookTire("앞왼쪽", 15);
						break;
					case 1:
						System.out.println("앞오른쪽 KumhoTire로 교체");
						car.frontRightTire = new KumhoTire("앞오른쪽", 13);
						break;
					case 2:
						System.out.println("뒤왼쪽 HankookTire로 교체");
						car.backLeftTire = new HankookTire("뒤왼쪽", 14);
						break;
					case 3:
						System.out.println("뒤오른쪽 KumhoTire로 교체");
						car.backRightTire = new KumhoTire("뒤오른쪽", 17);
						break;
					}
				}
			}
			System.out.println("------------------------"); // 1회 반복마다 출력
		}
		


	}

}
