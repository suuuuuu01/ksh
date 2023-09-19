package ch16.sec01.test;

import ch16.sec01.Calculable;

public class CalculatorExample {

	public static void main(String[] args) {
		// 객체생성할 필요가 없다.
		// 람다식으로 재정의한 내용을 익명구현객체 작업.
		action((x, y)-> {
			int result = x + y;
			System.out.println("result: " + result);
		});		
		
	}
		
	public static void action(Calculator calculator) {
		calculator.add(10, 20);
	}
}
