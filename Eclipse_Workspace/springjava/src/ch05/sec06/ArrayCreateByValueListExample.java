package ch05.sec06;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// 배열 - 동일한 데이터타입의 값을 저장하기 위한 연속적인 형태의 기억장소(자료구조)
		/*
		 데이터타입[] 변수 = new 데이터타입[길이];
		 
		 데이터타입 : 1) 기본 데이터타입  2) 참조타입
		 
		 배열은 참조타입이다.
		 */
		
		// 1) 기본데이터타입을 이용한 배열
		int[] scores = {83, 90, 87}; // 힙영역에 생성된 기억장소의 값은 int형으로 한다.
		
		// 총 합과 평균 구하기
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		int avg = sum / 3; // 실수값으로 구할 수 있다.
		System.out.println("평균: " + avg);
		
		// 2) 참조타입을 이용한 배열
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		// 배열의 항목값 읽기
		System.out.println("seoson[0] : " + season[0]); // 힙영역에 "Spring" 데이터의 저장된 주소를 통하여 데이터를 읽기
		System.out.println("seoson[1] : " + season[1]); // 힙영역에 "Summer" 데이터의 저장된 주소를 통하여 데이터를 읽기
		System.out.println("seoson[2] : " + season[2]); // 힙영역에 "Fall" 데이터의 저장된 주소를 통하여 데이터를 읽기
		System.out.println("seoson[3] : " + season[3]); // 힙영역에 "Winter" 데이터의 저장된 주소를 통하여 데이터를 읽기
		
		// 인덱스 1번 항목의 값 변경.
		season[1] = "여름"; // 힙영역에 "여름" 데이터의 저장된 주소가 대입된다.
		System.out.println("season[1] : " + season[1]);

	}

}
