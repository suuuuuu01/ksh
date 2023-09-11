package ch08.sec11.exam02;

// 매개변수 다형성
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		// 버스 선택
		Bus bus = new Bus();
		driver.drive(bus); // 다형성
		
		// 택시 선택
		Taxi taxi = new Taxi();
		driver.drive(taxi); // 다형성
		
		Bycle bycle = new Bycle();
		driver.drive(bycle); // 다형성
	}

}
