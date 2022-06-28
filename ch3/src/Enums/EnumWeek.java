package Enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.printf("오늘 요일은 %s\n",today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 영화를 보러갑니다.");
		}
		else {
			System.out.println("열심히 프로그램 코딩합니다.");
		}

	}

}
