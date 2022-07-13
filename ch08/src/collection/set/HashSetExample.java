package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// set
		Set<String> set = new HashSet<>();
		
		// 요소 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP/Servlet");
		set.add("Java");
		set.add("MyBatis");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();	// 반복자 얻기
		while(iterator.hasNext()) {				// 객체 수만큼 반복
			String element = iterator.next();	// 1개의 객체 가져옴
			System.out.println("\t" + element);
		}
		
		// 요소 삭제
		set.remove("JDBC");
		System.out.println("총 객체수: " + set.size());
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		// 모든 요소 삭제
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
