package generic.box;

public class Apple {
	String name;
	
	Apple(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
