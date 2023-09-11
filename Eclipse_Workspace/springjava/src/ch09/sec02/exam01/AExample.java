package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		
		// A 객체생성 
		A a = new A();
		
		// 중첩클래스를 이용한 객체생성
		A.B b1 = a.new B();
		A.B b2 = a.new B();
		A.B b3 = a.new B();
		
	}

}
