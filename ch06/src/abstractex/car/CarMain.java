package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		bus.run();
		truck.run();
		
		bus.refuel();
		truck.refuel();
		
		bus.takePassenger();
		truck.load();
		
		bus.stop();
		truck.stop();

	}

}
