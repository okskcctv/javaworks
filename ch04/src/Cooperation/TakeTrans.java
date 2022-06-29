package Cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Person p1 = new Person("안산", 10000);
		Person p2 = new Person("류현진", 5000);
		
		
		Bus bus100 = new Bus(100);
		Subway subway1 = new Subway("1호선");
		
		p1.takeBus(bus100);
		p1.showInfo();
		p2.takeBus(bus100);
		p2.showInfo();
		
		p1.takeSubway(subway1);
		p1.showInfo();
		p2.takeSubway(subway1);
		p2.showInfo();
		
		bus100.showInfo();
		subway1.showInfo();

	}

}
