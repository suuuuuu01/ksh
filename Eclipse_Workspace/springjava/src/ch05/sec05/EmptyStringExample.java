package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		// String 클래스의 초기값 설정
		// 참조타입의 변수는 초기값을 null로 한다.
		// . : 참조연산자
		String hobby = ""; // null보다는 "" 빈 문자열을 주로 사용한다. null로 하면 에러.
		if(hobby.equals("")) { 
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열.");
		}

	}

}
