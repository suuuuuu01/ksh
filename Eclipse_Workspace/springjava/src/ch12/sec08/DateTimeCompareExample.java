package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// Date, Calendar 클래스는 날짜와 시간의 조작기능이 없다.
// 날짜와 시간 비교
public class DateTimeCompareExample {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
		System.out.println("시작일: " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		System.out.println("종료일: " + endDateTime.format(dtf));

		// startDateTime가 endDateTime보다 이전 날짜인지?
		if(startDateTime.isBefore(endDateTime)) { // 이전 날짜인지? 
			System.out.println("진행 중입니다.");
		}else if(startDateTime.isEqual(endDateTime)) { // 동일 날짜인지?
			System.out.println("종료합니다.");
		}else if (startDateTime.isAfter(endDateTime)) { // 이후 날짜인지? 
			System.out.println("종료했습니다.");
		}
		
		// 시작일과 종료일의 날짜 차이를 구하는 작업
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond);
	}

}
