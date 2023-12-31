package ch02.sec10;

public class StringCastingExample {

	public static void main(String[] args) {
		// 문자열 데이터를 각 데이터타입에 맞게 형변환하는 예제
		// "10" -> int
		int value1 = Integer.parseInt("10");
		// "3.14" -> Double
		double value2 = Double.parseDouble("3.14");
		// "true"
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

		// 10, 3.14, true 값을 문자열로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}

}
