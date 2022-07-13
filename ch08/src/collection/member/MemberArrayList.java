package collection.member;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	// 회원 추가 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 회원 검색 메서드
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	// 향상된 for문 회원 검색 메서드
	public void showAllMemberUp() {
		for(Member i : arrayList) {
			System.out.println(i);
		}
	}
	
	// 회원 삭제 메서드
	public boolean deleteMember(int dbMemberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if(member.getMemberId() == dbMemberId) {
				arrayList.remove(i);
				return false;
			}
		}
		System.out.println(dbMemberId + "번 회원이 존재하지 않습니다.");
		return false;
	}
	
	// 고객 정보 삭제 맴버형식도 받아요
	public boolean deleteMemberMy(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			for(int i=0; i<arrayList.size(); i++) {
				if(member == arrayList.get(i)) {
					arrayList.remove(i);
					return false;
				}
			}
			System.out.println(member.getMemberId() + "번 회원이 존재하지 않습니다.");
			return false;
		}
		System.out.println("올바른 형식이 아닙니다.");
		return false;
	}
	
	public boolean deleteMemberMy(int dbMemberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if(dbMemberId == member.getMemberId()) {
				arrayList.remove(i);
				return false;
			}
		}
		System.out.println(dbMemberId + "번 회원이 존재하지 않습니다.");
		return false;
	}
}
