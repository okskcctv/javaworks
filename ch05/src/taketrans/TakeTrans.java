package taketrans;

public class TakeTrans {

	public static void main(String[] args) {
		Student sohee = new Student("박소희", 10000);
		Student daeho = new Student("이대호", 20000);
		
		Bus bus100 = new Bus("bus100");
		Taxi kakaoTaxi = new Taxi("카카오택시");
		
		sohee.take(bus100, 1200);
		daeho.take(kakaoTaxi, 3800);
		
		sohee.showInfo();
		bus100.showInfo();
		
		daeho.showInfo();
		kakaoTaxi.showInfo();
	}

}
