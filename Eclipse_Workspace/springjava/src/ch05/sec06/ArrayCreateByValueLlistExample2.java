package ch05.sec06;

public class ArrayCreateByValueLlistExample2 {

	public static void main(String[] args) {
		// 참조타입의 주소대입
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		printItem(new int[] {83, 90, 87}); // 힙영역에 데이터가 저장되어 있는 주소 대입	
		printItem(new int[] {50, 85, 64});
		printItem(new int[] {23, 54, 75});
		
	}
	
	// 메소드 정의(선언) like 자바스크립트 함수 public static 리턴타입 메소드명(작명)
	public static void printItem(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			System.out.println("score[" + i + "]:" + scores[i]);
		}
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("총합: " + sum);
		System.out.println("평균: " + (double) sum / scores.length);
		System.out.println("-----------------------------------------------------------------------------");
	}
	
	// 합계를 구하는 메소드
	public static void sum(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("scores 배열의 점수 총합: " + sum);
		System.out.println("-----------------------------------------------------------------------------");
	}
	
}





