package collection.member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberHashSet {
	
	private Set<Member> hashSet;
	
	public MemberHashSet(){
		hashSet = new HashSet<>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	// 회원 목록 보기
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		// 반복자 객체 얻기
		/* Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {	// 자료가 있다면 가져옴
			Member member = ir.next();	// 1개의 객체를 가져옴
			System.out.println(member);	// 1개씩 출력
		} */
	}
	
	// 회원 삭제
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return false;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
}
