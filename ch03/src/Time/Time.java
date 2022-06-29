package Time;

import java.util.Calendar;

public class Time {

	public static void main(String[] args) {
		
		Calendar startDay = Calendar.getInstance();
		Calendar toDay = Calendar.getInstance();
		
		startDay.set(2022, 5, 9);
		
		toDay.set(2022, 6, 29);
		
		long passedTime = toDay.getTimeInMillis() - startDay.getTimeInMillis();
		
		passedTime = passedTime / (24 * 60 * 60 * 1000);
		System.out.println(passedTime);

	}

}
