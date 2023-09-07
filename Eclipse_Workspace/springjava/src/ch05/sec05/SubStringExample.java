package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// 문자열 추출하기.
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 0~5범위의 문자열 추출. 생년월일 6자리
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 6 이후의 문자열 추출.
		System.out.println(secondNum);

	}

}
