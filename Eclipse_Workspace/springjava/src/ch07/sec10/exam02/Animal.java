package ch07.sec10.exam02;

// 추상클래스는 abstract 키워드를 적용하면 된다.
// 추상메소드를 1개라도 보유 시, 클래스를 추상클래스로 abstract 키워드를 적용해야 함.
public abstract class Animal {
	
	// 메소드의 구성
	/*
	 * void method() : head
	 	{
	 		} : body
	 */
	// 일반 메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상메소드 body(블록{})가 없다.
	abstract void sound();
}
