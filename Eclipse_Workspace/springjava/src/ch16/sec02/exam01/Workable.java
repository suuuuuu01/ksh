package ch16.sec02.exam01;

// 함수형 인터페이스 : 추상메소드 1개, 람다식으로 재정의하여 사용가능.
@FunctionalInterface
public interface Workable {
	void work(String name, String job); // 매개변수가 없다. -> 매개변수가 없는 람다식 문법 사용.
}
