package chap13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test13_1 {

	public static void main(String[] args) {
		// 1) 1. O, 2. O, 3. O, 4. X(List는 여러개의 null 저장가능)
		
		// 2) 1. O, 2. O, 3. X(자동으로 정렬해줌), 4. O(링크만 변경되기때문에 빠름)
		
		// 3) 1. O, 2. O, 3. O, 4. X
		
		// 4) 4
		
		// 5)
		List<Board> board1 = new ArrayList<>();
		// ArrayList<Board> board = new ArrayList<>();
		// ArrayList로 선언했었는데 List로 불러오고 이후 ArrayList 주면됨
		
		// 6)
		Map<String, Integer> student1 = new HashMap<String, Integer>();
		
		// 7)
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		
		// 8)
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));	// 학번이 같아 저장 안됨
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
		
		// 9)
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// 최고 점수를 받은 아이디 저장
		int maxScore = 0;		// 최고 점수 저장
		int totalScore = 0;		// 점수 합계 저장
		
		// 평균점수: 91
		// 최고점수: 96
		// 최고점수를 받은 아이디: blue
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator1 = keySet.iterator();
		while(iterator1.hasNext()) {
			String key = iterator1.next();
			Integer value = map.get(key);
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}
			totalScore += value;
		}
		System.out.println("평균점수: " + totalScore / map.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}

class Board{
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {return title;}
	public String getContent() {return content;}
}

class BoardDao{		// 전부 getBoardList 안에 넣어도 OK
	List<Board> list = new ArrayList<>();
	
	public BoardDao() {
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
	}
	
	public List<Board> getBoardList(){
		return list;
	}
}

class Student{
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return studentNum == student.studentNum;
		}
		return false;
	}
	
	// 교과서 equals 답안
	public boolean equals2(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student student = (Student)obj;
		if(studentNum != student.studentNum) return false;
		return true;
	}
}