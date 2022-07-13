package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> vegeList = new ArrayList<>();
		
		// 객체 추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		// 특정 위치에 객체 추가
		vegeList.add(2, "고추");
		
		// 객체의 개수
		int number = vegeList.size();
		System.out.printf("총 객체수 : %d개\n", number);
		
		// 특정 객체 가져오기
		System.out.println(vegeList.get(1));
		
		// 객체 목록
		for(int i=0; i<vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.print(vegetable + " ");
		}
		
		// 객체 수정
		vegeList.set(0, "상추");
		System.out.println();
		
		// 향상된 for문
		for(String vegetable : vegeList) {
			System.out.print(vegetable + " ");
		}
		
		// 객체 삭제
		vegeList.remove(3);
		System.out.println();
		
		for(String vegetable : vegeList) {
			System.out.print(vegetable + " ");
		}
	}

}
