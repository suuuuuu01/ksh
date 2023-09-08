package ch08.sec02;

// 인터페이스는 상속목적으로 설계. 추상클래스도 동일. new를 이용한 객체생성작업은 불가능.
// 전자제품의 리모컨 : 규격
public interface RemoteControl {

	// 일반적인 메소드를 선언 불가능
//	public void turnOn() {
//		System.out.println("출발");
//	}
	
	// 추상메소드
	public void turnOn(); // 컴파일작업 public abstract void turnOn();
	
}
