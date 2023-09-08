package ch07.sec10.exam02;

// 추상메소드가 있는 추상 클래스를 상쇽 받는경우, 자식 클래스는 추상메소드를
// 반드시 재정의 해야한다.
public class Cat extends Animal {
// 테스트 
	@Override
	void sound() {
		System.out.println("야옹");
		
	}

	
}
