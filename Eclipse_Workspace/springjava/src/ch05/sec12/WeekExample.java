package ch05.sec12;

import java.util.Calendar;

//import java.util.Calendar; javaFX란

public class WeekExample {

	public static void main(String[] args) {
		
		Week today = null;
		
		// Date, Calendar, LocalDate 등
		java.util.Calendar cal = Calendar.getInstance(); // 시스템의 날짜, 시간정보를 참조
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1~7 1은 SUNDAY(일요일)
		
		switch(week) {
			case 1 : today = Week.SUNDAY; break;
			case 2 : today = Week.MONDAY; break;
			case 3 : today = Week.TUESDAY; break;
			case 4 : today = Week.WENDSDAY; break;
			case 5 : today = Week.THURSDAY; break;
			case 6 : today = Week.FRIDAY; break;
			case 7 : today = Week.SATURDAY; break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("휴식을 한다.");
		}else {
			System.out.println("자바공부를 한다.");
		}

	}

}
