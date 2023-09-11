package ch09.sec04.exam03;

// getter, setter

public class A {
	// 메소드
	public void method1(final int arg) { // final int arg. jdk 1.8 이후 지원.
		// 로컬변수
		int var = 1; // final int var = 1;
//		var = 2; // 변경가능
		
		// 로컬 클래스
		class B {
			// 메소드 
			void method2() {
				// 로컬 변수읽기.
				System.out.println("arg: " + arg); // 접근가능 jdk 1.8에서는 매개변수에 final 키워드를 사용해야 한다.
				System.out.println("var: " + var); // 접근가능
				
				// 로컬 변수 수정 setter 지원 X
//				arg = 2; // 변경 불가능
//				var = 2; // 변경 불가능
			}
		}
		
		// 로컬 객체 생성
		B b = new B();
		b.method2();
//		arg = 3;
//		var = 3;
	}
}
