package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		// 문자열 찾기
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 검색문자열이 존재하지 않으면 -1 값을 반환.
		System.out.println(location);
		
		// substring
		String programing = subject.substring(2);
		System.out.println(programing); // 실습

		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바"); // 값을 바꿔보기
		if(location != -1) {
			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련된 책이 아닙니다.");
		}
		
		boolean result = subject.contains("오라클");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}

}
