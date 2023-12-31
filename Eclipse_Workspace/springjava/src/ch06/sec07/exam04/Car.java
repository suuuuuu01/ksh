package ch06.sec07.exam04;

// 생성자 오버로딩(overroading) : 생성자를 여러 개 정의하는 의미.
public class Car {

	
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언 4개. 생성자 오버로딩(overroading)
	// 매개변수의 개수와 타입의 순서가 다른 경우만 문법이 허용된다.
	
	Car(){} // default 생성자는 다른 생성자선언 때문에 자동생성되지 않으므로, 수동으로 선언함.
	
	Car(String model) {
		this.model = model;

	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
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
