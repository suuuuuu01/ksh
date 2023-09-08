package ch08.sec02;

public class RemoteControlExamaple {

	public static void main(String[] args) {
		// 객체생성 불가능
//		RemoteControl remoteControl = new RemoteControl();
		
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn(); // Television클래스구현 메소드 호출
		
		rc = new Audio();
		rc.turnOn(); // Audio 클래스 구현 메소드 호출

	}

}
