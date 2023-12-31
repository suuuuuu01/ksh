package ch06.sec07.exam05;

// 생성자 오버로딩(overroading) : 생성자를 여러 개 정의하는 의미.
// 새로운 생성자를 정의하지 않고, 기존 생성자를 호출하는 예제. this()
public class Car {

	
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언 4개. 생성자 오버로딩(overroading)
	// 매개변수의 개수와 타입의 순서가 다른 경우만 문법이 허용된다.
	
	Car(String model) {
		this(model, "은색", 250); // 25라인 생성자 호출
	}
	
	Car(String model, String color){
		this(model, color, 250); // 25라인 생성자 호출
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	// 위의 매개변수의 개수와 타입순서가 동일하므로 허용이 안 된다.
//	Car(String m, String c, int m) {
//		this.model = m;
//		this.color = c;
//		this.maxSpeed = m;
//		
//	}

}
