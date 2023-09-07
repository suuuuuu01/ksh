package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// String 클래스는 참조타입이지만, 기본데이터 타입 스타일과 참조데이터 타입 스타일 2가지 특징을 가지고 있다.
		
		// 1) 기본데이터 타입 스타일. 힙영역에 생성한 동일한 문자열 데이터의 주소를 공유한다.
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		// String 변수의 주소비교는 == 비교연산자를 사용한다.
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음."); // 주소가 같다.
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름."); // 주소가 다르다.
		}
		
		// 데이터 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열데이터가 같음.");
		}
		
		// 2) 참조데이터 타입 스타일. 참조타입은 기본적으로 아래 구문처럼 사용해야 한다.
		// "홍길동" 문자열 데이터가 동일해도, 힙영역에 기억장소가 각각 생성된다.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		// 주소비교
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음."); // 주소가 같다.
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름."); // 주소가 다르다.
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열데이터가 같음.");
		}
		
	}

}
