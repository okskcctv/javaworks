package Statics;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student2 lee = new Student2();
		Student2 han = new Student2();
		
		lee.setName("이대한");
		han.setName("한지수");

		System.out.println(lee.getId());
		System.out.println(lee.getName());

		System.out.println(han.getId());
		System.out.println(han.getName());

	}

}
