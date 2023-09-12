package ch09.sec07.exam2;

// 인터페이스를 익명구현객체 사용(상속 대신 직접 사용)
public class Home {

	// RemoteControl rc = new RemoteControl(); // 인터페이스는 객체생산 가능.
	// 필드에 익명구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	// 메소드
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("에어컨을 끕니다.");
	}

	
	rc.turnOn();
	rc.turnOff();
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
		}
	}
}
