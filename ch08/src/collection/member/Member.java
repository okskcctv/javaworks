package collection.member;

public class Member {
	private int memberId;		// 회원아이디
	private String memberName;	// 회원이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "님의 아이디는 " + memberId + "입니다.";
	}
}
