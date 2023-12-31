package ch06.sec15;

// 디자인 패턴 : 싱글톤 패턴 클래스 예제
// 싱글톤 : 클래스를 이용하여, 단 하나의 객체만 생성하는 목적.
public class Singleton {
	
	// 객체를 내부 생성
	private static Singleton singleton = new Singleton();
	
	// 생성자 - private
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
