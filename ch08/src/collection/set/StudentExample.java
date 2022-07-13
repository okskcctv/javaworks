package collection.set;

import java.util.HashSet;
import java.util.Set;

public class StudentExample {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("오지능", 30));
		set.add(new Student("오지능", 30));
		
		System.out.println("총 객체수: " + set.size());
	}

}
