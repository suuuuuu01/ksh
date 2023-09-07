package ch02.sec09;

public class StringCooncatExample {

	public static void main(String[] args) {
		// 문자열 연결 연산자 : + 
		
		int result1 = 10 + 2 + 8;
		System.out.println("result1 : " + result1);
		
		// 결합연산. 숫자와 문자열이 연산 시 결과는 String이다. 
		// 숫자가  +연산자 문자열을 만나면, 문자열로 변환된다. (중요)
		String result2 = 10 + 2 + "8"; // 12 + "8"; 
		System.out.println("result2 : " + result2);
		
		String result3 = 10 + "2" + 8; // "102" + 8;
		System.out.println("result3 : " + result3);
		
		String result4 = "10" + 2 + 8; // "102" + 8; 
		System.out.println("result4 : " + result4);
		
		String result5 = "10" + (2 + 8); // "10" + 10;
		System.out.println("result5 : " + result5);

		// String result6 = "10" - 10; // 에러발생.
		
	}

}
