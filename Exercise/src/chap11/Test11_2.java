package chap11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test11_2 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String nowDate = sdf.format(now);
		System.out.println(nowDate);
		
		Calendar now1 = Calendar.getInstance();
		int year = now1.get(Calendar.YEAR);
		int month = now1.get(Calendar.MONTH) + 1;
		int day = now1.get(Calendar.DAY_OF_MONTH);
		
		int week = now1.get(Calendar.DAY_OF_WEEK);
		String[] weekend = new String[] {"일","월", "화", "수", "목", "금", "토"};
		String strWeek = weekend[week - 1];
		/* switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
			break;
		}
		*/
		
		int hour = now1.get(Calendar.HOUR_OF_DAY);
		int minute = now1.get(Calendar.MINUTE);
		
		String month0 = String.format("%02d", month);
		String day0 = String.format("%02d", day);
		String hour0 = String.format("%02d", hour);
		String minute0 = String.format("%02d", minute);
		
		System.out.printf("%d년 %s월 %s일 %s요일 %s시 %s분", year, month0, day0, strWeek,
					hour0, minute0);
	}

}
