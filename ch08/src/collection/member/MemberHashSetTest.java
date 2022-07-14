package collection.member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		// 회원 추가
		memberHashSet.addMember(new Member(1001, "네이버"));
		memberHashSet.addMember(new Member(1002, "다음"));
		memberHashSet.addMember(new Member(1003, "구글"));;
		memberHashSet.addMember(new Member(1001, "네이버"));
		
		// 회원 검색
		memberHashSet.showAllMember();
		System.out.println();
		
		// 회원 삭제
		memberHashSet.removeMember(1003);
		memberHashSet.removeMember(1004);
		System.out.println();
		
		memberHashSet.showAllMember();
	}
}
