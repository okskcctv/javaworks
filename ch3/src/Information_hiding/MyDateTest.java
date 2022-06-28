package Information_hiding;

public class MyDateTest {

	public static void main(String[] args) {
		// MyDate 클래스 객체 생성
		MyDate date = new MyDate();
		// date.day = 20;
		date.setYear(2024);
		date.setMonth(2);
		date.setDay(29);
		
		System.out.printf("나의 생일은 %d년 %d월 %d일 입니다.", 
				date.getYear(), date.getMonth(), date.getDay());

	}

}
