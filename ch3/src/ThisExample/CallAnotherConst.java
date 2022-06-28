package ThisExample;

class Person{
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person noName = new Person();
		Person son = new Person("손흥민", 31);
		System.out.println(noName.name);
		System.out.println(son.name);
		
		Person p = noName.returnItSelf(); // 객체 반환
		
		System.out.println(p);
		System.out.println(noName);

	}

}
