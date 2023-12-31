package ch06.sec10.exam02;

// 정적 블럭 {...} : 정적필드를 초기화하는 작업에 사용.

public class Television {
	
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
//	System.out.println(); // 다음과 같은 위치는 호출, 제어, 반복문 사용 불가능
	
//	static color = "노랑색";
	
	// 정적블럭 : 정적멤버필드를 초기화 작업. 정적멤버필드가 메모리가 생성이 되고 난 후, 자동호출되는 특징.
	// 블럭 {} : 제어문, 반복문, 실행문장 등 구문을 사용할 수가 있다.
	static {
		info = company + "-" + model;
		System.out.println("정적 블럭 호출");
	}
	
	// 현재 클래스에 인스턴스 멤버가 존재할 경우에 객체생성구문을 통하여 참조하게 된다.
	// 그럴 일이 없으면, 이런 코드는 작성해선 안 된다.
	Television() {
		company = "";
	}
}
