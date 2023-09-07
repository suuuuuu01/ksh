package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {

		// 실수데이터 타입이 부동소숫점 방식으로 인한 연산 오차발생 예제.
		// 문제? 사과 1개를 0.1 단위의 10조각으로 보고, 그 중 7조각(0.7)을 뺀 3조각(0.3) 변수에 저장
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// 1 - 7 * 0.1 일반적인 결과 예상? 0.3이 떨어질까? 사과 1개에서 남은 양: 0.29999999999999993
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}

}
