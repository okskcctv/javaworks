package collection.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {
	// HashMap 객체 생성
	Map<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		// memberId, member
		hashMap.put(member.getMemberId(), member);
	}
	
	// 회원 목록
	public void showAllMember() {
		// 반복자 객체 선언
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
	// 회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return false;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
}
