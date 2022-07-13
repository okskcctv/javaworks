package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberList = new MemberArrayList();
		
		// 회원 생성 및 추가
		memberList.addMember(new Member(1001, "추신수"));
		memberList.addMember(new Member(1002, "손흥민"));
		memberList.addMember(new Member(1003, "이지은"));
		memberList.addMember(new Member(1004, "김영미"));
		
		// 회원 전체 검색
		memberList.showAllMember();
		System.out.println();
		memberList.deleteMember(1003);
		memberList.deleteMember(1005);
		
		memberList.showAllMember();
	}
}
