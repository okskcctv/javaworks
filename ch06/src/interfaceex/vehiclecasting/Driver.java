package interfaceex.vehiclecasting;

public class Driver {
	
	// 운전하다 매개변수 vehicle 
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
