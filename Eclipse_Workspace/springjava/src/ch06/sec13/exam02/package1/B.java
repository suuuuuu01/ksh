package ch06.sec13.exam02.package1;

public class B {
	// 필드선언
	A a1 = new A(true);
	A a2 = new A(1);
	
	// A("문자열"); 생성자가 private이면, 동일한 패키지라도 접근불가.
//	A a3 = new A("문자열");
}
