package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		// 객체생성
		A a = new A();
		
		// 필드값 변경
		a.field1 = 1; // public이므로 접근.
//		a.field2 = 1; // 다른 패키지이므로 default 접근자는 접근 불가능.
//		a.field3 = 1; // private이므로 접근 불가능.
		
		a.method1(); // public이므로 접근가능.
//		a.method2(); // 다른 패키지이므로 default접근자는 접근 불가능
//		a.method3(); // private이므로 접근 불가능
				
	}
}
