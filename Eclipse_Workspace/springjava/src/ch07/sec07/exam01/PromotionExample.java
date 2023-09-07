package ch07.sec07.exam01;

// 자바문법은 직계 상속관계 클래스일 경우에만 형변환 작업이 가능하도록 되어있다.
// A - B - D  // A - C - E 가능한 형변환

class A {} // A.class
	
class B extends A {} // B.class

class C extends A {} // C.class

class D extends B {} // D.class
 
class E extends C {} // E.class

public class PromotionExample { // PromotionExample.class
	
	// JVM 소속
	public static void main(String[] args) { 
		B b = new B(); // B -> A			
		C c = new C(); // C -> A
		D d = new D(); // D -> B -> A
		E e = new E(); // E -> C -> A
		
		// 자동형변환. 부모 변수 = 자식객체
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 형변환 에러발생
//		B b3 = e; // 상속이 직계가 아니므로 형변환 지원 안 함.
//		C c2 = d;
	}

}
