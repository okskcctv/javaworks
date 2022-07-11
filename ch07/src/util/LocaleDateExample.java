package util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocaleDateExample {

	public static void main(String[] args) {
		// Date 클래스 사용
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd"); // 날짜 포맷
		System.out.println(date.format(today));
		
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a"); // 시간 포맷
		System.out.println(time.format(today));
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		System.out.println("================================");
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss a");
		
		String formattedDate = now.format(myFormat);
		System.out.println(formattedDate);
		
	}

}
