package BuiltInClass;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		System.out.printf("%d시 %d분 %d초 %d\n", hour, minute, second, millisecond);
		System.out.printf("%d", day); // 1-일, 2-월, 3-화, ... 6-토
		
	}

}
