package inheritance;

class Car{
	String brand;
	int cc;
	
	Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;
	}
}

public class Taxi extends Car {
	int passenger;
	
	Taxi(String brand, int cc, int passenger){
		super(brand, cc);
		this.passenger = passenger;
	}
}
