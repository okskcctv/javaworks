package dbconnection.person;

import java.util.ArrayList;

public class MyPersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		Person person1 = new Person();
		
		person1 = dao.getPerson("cloud");
		System.out.println(person1.getUserId());
		System.out.println(person1.getUserPw());
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		// 전체 조회
		personList = dao.getPersonList();
		
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			System.out.println(person.getUserId());
			System.out.println(person.getUserPw());
			System.out.println(person.getName());
			System.out.println(person.getAge());
		}
	}

}
