package ch06.sec13.exam03.package1;

public class A {
	
	// 필드선언
	public int field1;
	
	int field2; // 접근자는 default 의미
	
	private int field3;
	
	// 생성자
	// 필드와 메소드 접근이 가능. 즉 필드와 메소드는 클래스 내부에서 접근자는 상관없음.
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	
	void method2() {} // default
	
	private void method3() {}
}
