package abstractex.animal;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		// 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	// private를 권장
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
