package ch13.sec01.exam03;

public class GenericExample {

	public static void main(String[] args) {
		// 제네릭 없이 객체생성. Object클래스로 타입이 사용.
		Box box1 = new Box();
		box1.content = "100"; // Object
		
		Box box2 = new Box();
		box2.content = "100"; // Object
		
		Box box3 = new Box();
		box3.content = "100"; // Object
		
		boolean result1 = box1.compare(box2);
		System.out.println("result1: " + result1);
		
		boolean result2 = box2.compare(box3);
		System.out.println("result2: " + result2);
	}
}
