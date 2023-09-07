package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		// System.out.println(); 콘솔화면(모니터)에 값을 출력하는 기능
		
		// 상품의 가격: 123원
		int value = 123;
		System.out.println("상품의 가격: " + value + "원");
		
		// 변수가 int -> %d
		System.out.printf("상품의 가격: %d원\n", value);
		// %6d -> 6은 6자리 공간 만듦. value변수값이 우측 정렬
		System.out.printf("상품의 가격: %6d원\n", value);
		// %-6d -> 6은 6자리 공간 만듦. value변수값이 - 좌측 정렬
		System.out.printf("상품의 가격: %-6d원\n", value);
		// %06d -> 6은 6자리 공간 만듦. value변수값이 우측 정렬. 왼쪽 3자리는 0으로 채움
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n ", 10, area); //3.14139000 -> 3.14
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
	}

}
