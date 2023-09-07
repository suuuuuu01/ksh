package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// NULL 에러
		int[] intArray = null;
		// intArray 변수에는 힙영역에 생성된 주소가 없기 때문에 값을 대입할 수가 없다.
//		intArray[0] = 10; // NullPointerException(NPE) 에러가 발생됨.
		
		String str = null;
		System.out.println("총 문자 수: " + str.length()); // NullPointerException(NPE) 에러가 발생됨.

	}

}
