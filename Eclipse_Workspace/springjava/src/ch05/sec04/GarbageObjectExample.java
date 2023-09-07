package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// String 클래스 : 문자열 데이터를 사용하는 목적
		// 참조타입이지만, 사용법은 기본데이터타입 스타일처럼 사용할 수 있다.
		
		String hobby = "여행"; // 힙영역의 "여행"이라는 문자열데이터가 저장되는 주소를 할당.
		hobby = null; // 할당된 주소가 없기 때문에 쓰레기로 만들어 버림.
		
		String kind1 = "자동차";
		String kind2 = kind1; // 힙영역에 "자동차"가 저장되어 있는 주소를 kind1로부터 대입받는다.
		kind1 = null;
		
		System.out.println("kind2: " + kind2);
		
		// GC(Garbage Collector) : 사용하지 않는 객체의 힙메모리를 소멸시키고, 메모리를 관리하는 기능

	}

}
