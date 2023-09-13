package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date(); // 시스템의 현재 날짜, 시간정보
		String strNow1 = now.toString();
		System.out.println(strNow1); // Wed Sep 13 14:31:59 KST 2023
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // yyyy.MM.dd이나 yyyy-MM-dd로 바꿀 수 있음.
		String strNow2 = sdf.format(now); // 2023.09.13 14:33:28
		System.out.println(strNow2);
		
		
	}

}
