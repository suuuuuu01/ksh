package ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		// TV객체를 생성하고, 인터페이스 변수에 대입 . 다형성
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		// 디폴트 메소드 호출. 부모인터페이스의 default메소드 호출.
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		// Audio객체를 생성하고, 인터페이스 변수에 대입 . 다형성
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
	
		// 디폴트 메소드 호출. 재정의된 메소드 호출.
		rc.setMute(true);
		rc.setMute(false);
		
		rc.turnOff();
		
		RemoteControl.changeBattery();
	
	}

}
