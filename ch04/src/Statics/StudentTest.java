package Statics;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student();
		Student han = new Student();
		lee.setName("이대한");
		han.setName("한지수");
		
		// System.out.println(lee.serialNum);
		System.out.println(++Student.serialNum); // static이 있으면 객체에 직접 접근하지 마라
		System.out.println(lee.getName());
		
		
		System.out.println(++Student.serialNum);
		System.out.println(han.getName());

	}

}
