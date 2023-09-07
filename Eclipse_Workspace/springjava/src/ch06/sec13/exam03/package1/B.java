package ch06.sec13.exam03.package1;

public class B {

	// 메모리 생성작업 이후에 접근작업.
	// A클래스의 인스턴스 멤버를 사용하기 위해서 객체생성작업 필요
	
	// 객체생성
	public void method() {
		// 객체생성
		A a = new A();
		
		// 필드값 변경
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // private이므로 접근불가.
		
		// 메소드 호출
		a.method1();
		a.method2();
//		a.method3(); // private이므로 접근불가.
	}
}
