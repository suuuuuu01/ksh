package ch09.sec02.exam02;

public class A {
	
	// 인스턴스 멤버 클래스.
	// 인스턴스 멤버필드, 메소드는 가능. 단, Java 17에서는 static 멤버필드, 메소드가 허용
	class B {
		// 인스턴스 필드
		int field1 = 1;
		
		// 정적필드(Java 17부터 허용)
//		static int field2 = 2;
		
		// 생성자
		B() {
			System.out.println("B-생성자 실행");
			
		// 인스턴스 메소드
		void method1() {
			System.out.println("B-method1 실행");
		}
			
		// 정적 메소드(Java 17부터 허용)
//		static void method2() {
//			System.out.println("B-method2 실행");
//		}
		
		// 인스턴스 메소드
		void useB() {
			B b = new B();
			System.out.println(b.field1);
			b.method1();
			
			// Java 17 에서 호출가능
//			System.out.println(B.field2);
//			B.method2();
			}
		}
	}
	
}
