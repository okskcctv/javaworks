package collection.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("이순신", 85);
		map.put("홍길동", 90);
		map.put("강감찬", 80);
		map.put("홍길동", 75);
		System.out.println("총 객체 수: " + map.size());
		
		// 객체 찾기
		System.out.println("\t홍길동: " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");		// 키로 제거
		System.out.println("총 객체 수: " + map.size());
	}

}
