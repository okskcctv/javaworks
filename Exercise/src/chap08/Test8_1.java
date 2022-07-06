package chap08;

public class Test8_1 {
	
	static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		// 1.O 2.X 3.O 4.O
		
		// 1.O 2.O 3.X 4.O
		
		printSound(new Cat());
		printSound(new Dog());
	}

}

interface Soundable{
	String sound();
}

class Cat implements Soundable{
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable{
	public String sound() {
		return "멍멍";
	}
}