package dbconnection.person;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		// 자료 삽입
		/* Person p1 = new Person();
		p1.setUserId("sky");
		p1.setUserPw("sky11");
		p1.setName("하늘");
		p1.setAge(21);
		
		dao.insertPerson(p1);
		*/
		
		// 자료 수정
		Person p2 = new Person();
		p2.setUserId("today");
		p2.setUserPw("today11");	// 비밀번호 수정
		p2.setName("오늘");		// 이름 수정
		p2.setAge(35);
		
		dao.updatePerson(p2);
		
		// 자료 삭제
		Person deleteOne = new Person();
		deleteOne.setUserId("sky");
		dao.deletePerson(deleteOne);
		
		// 일부 조회
		Person selectOne = new Person();
		selectOne.setUserId("cloud");
		selectOne = dao.getPerson(selectOne.getUserId());
		printPerson(selectOne);
		
		// 전체 조회
		personList = dao.getPersonList();
		
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			printPerson(person);
		}
	}

	public static void printPerson(Person person) {
		System.out.println(person.getUserId());
		System.out.println(person.getUserPw());
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}