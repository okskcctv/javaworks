package SwitchCase;

public class Ranking {

	public static void main(String[] args) {
		// switch ~ case 문
		// 순위에 따른 메달 색깔
		int rank = 2;
		String medalColor;
		
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			System.out.println("메달이 없습니다.");
			medalColor = "None";
			break;
		}
		System.out.printf("메달 색깔은 %s입니다", medalColor);

	}

}
