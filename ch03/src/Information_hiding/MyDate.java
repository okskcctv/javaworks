package Information_hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
/*		if(month == 2) {
			if(day < 1 || day > 28) {
				if(day == 29) {
					if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
						System.out.println("윤년입니다.");
						this.day = day;
					}
					else {
						System.out.println("날짜 오류입니다.");
					}
				}
				else {
					System.out.println("날짜 오류입니다.");
				}
			}
			else {
				this.day = day;
			}
		}
		else{
			this.day = day;
		} */
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day<1 || day>31) {
				System.out.println("날짜 오류입니다.");
			}
			else {
				this.day = day;
			}
			break;
		case 2:
			if(day < 1 || day > 28) {
				if(day == 29) {
					if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
						System.out.println("윤년입니다.");
						this.day = day;
					}
					else {
						System.out.println("날짜 오류입니다.");
					}
				}
				else {
					System.out.println("날짜 오류입니다.");
				}
			}
			else {
				this.day = day;
			}
			break;
		case 4: case 6: case 9: case 11:
			if(day<1 || day>30) {
				System.out.println("날짜 오류입니다.");
			}
			else {
				this.day = day;
			}
			break;
		default:
			System.out.println("월을 먼저 입력해 주세요.");
			break;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int month) {
		if(month<1 || month>12) {
			System.out.println("달 입력 오류");
		}
		else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setYear(int year) {
		if(year < 0) {
			System.out.println("기원전은 받지 않습니다.");
		}
		else {
			this.year = year;
		}
	}
	
	public int getYear() {
		return year;
	}
	
}
