package ch12.sec10;

import java.util.regex.Pattern;

// 정규식 예제. - 문자열 데이터에 패턴검사를 하는 문법
public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식와 일치하지 않습니다.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // 전자우편 정규식
		data = "angel@mycompanycom"; // .이 없음 
		result = Pattern.matches(regExp, data);
	}

}
