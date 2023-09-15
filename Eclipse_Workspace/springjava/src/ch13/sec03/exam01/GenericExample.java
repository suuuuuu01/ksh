package ch13.sec03.exam01;

public class GenericExample {

	// 제네릭으로 설계된 메소드
	// <T> 리턴타입<T> 메서드명(T 매개변수);
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	/*
	 public static Box<Integer> boxing(Integer t) {
		Box<Integer> box = new Box<Integer>(); // Box클래스 멤버타입 Integer
		box.set(t);
		return box;
	}
	
	public static Box<String> boxing(String t) {
		Box<String> box = new Box<String>(); // Box클래스 멤버타입 String
		box.set(t);
		return box;
	}
	 */
	
	public static void main(String[] args) {
		// 제네릭 메소드 호출
		Box<Integer> box1 = boxing(100); // <T> Box<T> boxing(T t) -> (<T>가 <Integer>로 바뀌고 사라짐) Box<Integer> boxing(Integer t)
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동"); // Box<String> boxing(String t)
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
