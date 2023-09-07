package ch07.sec06.package1;

// protected 접근자 : 동일패키지 또는 자식객체에서 사용가능.
// 범위. private < [default] < protected < public
public class A {
	
	// 필드선언
	protected String field;
	
	// 생성자선언
	protected A() {}
	
	//메소드선언
	protected void method() {}

}
