package ch08.sec02;

public class RemoteControlExamaple {

	public static void main(String[] args) {
		// 객체생성 불가능
//		RemoteControl remoteControl = new RemoteControl();
		
		RemoteControl rc;
		
		rc = new Television(); // 다형성
		rc.turnOn(); // Television 클래스 구현(재정의) 메소드 호출
		
		rc = new Audio(); // 다형성
		rc.turnOn(); // Audio 클래스 구현(재정의) 메소드 호출

	}

}
