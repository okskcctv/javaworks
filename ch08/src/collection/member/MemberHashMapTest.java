package collection.member;

public class MemberHashMapTest {
	
	public static void main(String[] args) {
		
		MemberHashMap hashMap = new MemberHashMap();
		
		// 회원 추가
		hashMap.addMember(new Member(1001, "네이버"));
		hashMap.addMember(new Member(1002, "구글"));
		hashMap.addMember(new Member(1003, "다음"));
		hashMap.addMember(new Member(1004, "야후"));
		
		// 회원 목록
		hashMap.showAllMember();
		System.out.println();
		
		// 회원 삭제
		hashMap.removeMember(1003);
		hashMap.removeMember(1005);
		
		hashMap.showAllMember();
	}
}
