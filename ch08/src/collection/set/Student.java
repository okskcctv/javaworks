package collection.set;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {				// name과 age가 같으면
		return name.hashCode() + age;	// 동일한 hashCode를 리턴
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(student.name.equals(name) && (student.age == age)) {
				return true;
			}
		}
		return false;
	}
}
