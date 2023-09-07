package ch07.sec08.exam02;

// 운송수단을 선택하여, 실제 사용하는 클래스
public class Driver {
	public void drive(Vehicle vehicle) {
			// vehicle에 제공되는 객체가 bus, taxi에 따라서
			// 자식객체의 재정의된 메소드가 호출이 됨.
			vehicle.run();
	}
}
