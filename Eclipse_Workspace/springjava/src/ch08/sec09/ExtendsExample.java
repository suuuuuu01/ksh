package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		ia.methodA(); // 부모인터페이스 변수로 형변환되면, 자신의 추상메소드를 구현한 메소드만 호출 가능.
//		ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB(); // 부모인터페이스 변수로 형변환되면, 자신의 추상메소드를 구현한 메소드만 호출 가능.
		
		System.out.println();
		
		// 부모인터페이스 변수로 형변환되면, 자신의 추상메소드를 구현한 메소드만 호출 가능.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
