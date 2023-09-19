package ch16.sec01;

// 함수형 인터페이스 : 단 하나의 추상메소드를 가지고 있는 인터페이스
// 인터페이스에 익명구현객체를 람다식으로 표현하려면, 함수형 인터페이스여야 함
@FunctionalInterface 
// 컴파일 과정에서 추상메소드가 하나인지 검사를 한다. 
// 명시적으로 사용하여, 컴파일러에게 함수형 인터페이스라고 알림.
public interface Calculable {

	// 추상메소드 1개
	void calculate(int x, int y);
	
}
