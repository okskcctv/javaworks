package Operator;

public class Operator1 {

	public static void main(String[] args) {
		// 대입 연산자
		int num = 10;
		
		System.out.println(num); // 10
		System.out.println(-num); // -10 num은 10 그대로임
		
		// 값을 변경
		num = -num;
		System.out.println(num); // -10 num이 -10으로 바뀜
		
		String season = "summer";
		System.out.println(season);
		
		// 배열
		String[] seasons = {"spring", "summer", "fall", "winter"};
		System.out.println(seasons[0]);
		System.out.println(seasons[3]);
		System.out.println("***************************");
		System.out.println(seasons.length);
		
		for(int i=0; i<seasons.length; i++) {
			System.out.println(seasons[i]);
		}
		
	}

}
