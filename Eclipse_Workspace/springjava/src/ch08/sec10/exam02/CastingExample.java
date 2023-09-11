package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle  = new Bus();
		vehicle.run(); // 인터페이스 변수를 통하여 호출
//		vehicle.checkFare // 호출 안 됨.
		
		// 강제 타입 변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}

}
