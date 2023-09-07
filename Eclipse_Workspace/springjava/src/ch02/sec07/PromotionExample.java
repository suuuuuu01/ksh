package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		
		// 자동형변환 (묵시적형변환)
		// 큰 데이터타입 = 작은 데이터타입;
		// byte < short, char < int < long < float < double
		
		byte byteValue = 10;
		// 자동형변환. 1byte인 byteValue 변수값을 읽어와서 4byte로 변환하고, 그 값이 대입된다.
		int intValue = byteValue; // = 대입연산자를 기준으로 왼쪽의 타입에 오른쪽이 타입일치가 발생
		
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: "+ longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
