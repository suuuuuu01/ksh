package ch03.sec04;

public class AccuracyExample2 {

	public static void main(String[] args) {

		// 실수데이터 타입이 부동소숫점 방식으로 인한 연산 오차발생 예제.
		// 문제? 사과 1개를 0.1 단위의 10조각으로 보고, 그 중 7조각(0.7)을 뺀 3조각(0.3) 변수에 저장
		// 해결 : 1) 정수로 변환하는 방법. 2) BigDeciaml 클래스 사용. 3) 라이브러리 이용.
		int apple = 1;
//		double pieceUnit = 0.1;
		int totalPiece = apple * 10;
		int number = 7;
		
		double result = totalPiece - number;
		System.out.println("10조각에서 남은 조각: + result");
		System.out.println("사과 1개에서 남은 양: " + result / 10.0);

	}

}
