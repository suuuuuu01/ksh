package ch06.sec10.sec03;

public class Car {
	
	// 인스턴스 필드
	int speed;
	
	// 인스턴스 메소드. 인스턴스 메소드에서는 인스턴스 필드, 메소드는 사용 가능.
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	void stop() {
		run();
	}
	
	// 정적메소드. 정적메소드에서는 인스턴스 필드, 메소드를 사용 불가능.
	static void simulate() {
		// 객체 생성은 지역레벨이므로, 해당 메소드가 실행이 끝나면, 메모리는 자동 생성한다
		Car myCar = new Car();
		
		myCar.speed = 200;
		myCar.run();
		// 호출이 불가능? main()메소드에서 33라인에서 객체생성작업을 하지 않으면, speed, run(), stop()멤버필드인
		// 정보가 힙영역에 생성되지 않으므로, 접근 시 문제가 된다.
//		stop(); // 인스턴스 메소드가 호출 시 객체생성작업이 안 되어 있으면, 힙영역 메모싱에 stop()메소드의 정보가 없어서 호출 에러가 발생된다.
	}
	
	// 시작(실행) 클래스 : main()메소드는 작성되는 위치가 어떤 클래스든 상관없다.
	// Car클래스의 구성요소인 메소드가 아니다. 그리고, JVM에 의하여 관리가 이루어진다.
	public static void main(String[] args) {
		simulate(); // 	Car.simulate(); 클래스이름.메소드명 에서 클래스이름 생략가능.
		
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
	}
}
