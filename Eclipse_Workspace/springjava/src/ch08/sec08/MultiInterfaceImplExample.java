package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		
//		SmartTelevision st = new SmartTelevision(); // 3개의 메소드가 접근 가능
			
		RemoteControl rc = new SmartTelevision();
		// RemoteControl 인터페이스에 선언된 추상메소드로 재정의된 메소드만 호출 가능.
		rc.turnOn();
		rc.turnOff();
//		rc.search(); // 사용 불가능
		
		Searchable searchable = new SmartTelevision();
		// Searchable 인터페이스에 선언된 추상메소드로 재정의된 메소드만 호출 가능.
		searchable.search("http://www.youtube.com");
//		searchable.turnOn(); // 사용 불가능
//		searchable.turnOff(); // 사용 불가능

	}

}
