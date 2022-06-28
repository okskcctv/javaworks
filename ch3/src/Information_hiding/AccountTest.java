package Information_hiding;

public class AccountTest {

	public static void main(String[] args) {
		// Account 클래스의 객체 생성
		Account account = new Account();
		Account account2 = new Account("100-1235", "안산", 2000);
		
		// 필드에 접근 불가
		// account.ano = "100-1234";
		account.setAno("100-1234");
		// account.owner = "다이소";
		account.setOwner("다이소");
		// account.balance = 1000;
		account.setBalance(1000);
		
		System.out.printf("계좌번호 : %s\n 이름 : %s\n 잔고 : %,d\n", 
				account.getAno(), account.getOwner(), account.getBalance());
		System.out.printf("계좌번호 : %s\n 이름 : %s\n 잔고 : %,d\n", 
				account2.getAno(), account2.getOwner(), account2.getBalance());

	}

}
