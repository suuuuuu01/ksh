package ch05.sec07;

public class MultidimensionalArrayEx01 {

	public static void main(String[] args) {
		// 다차원 배열
		/*
		 int[] arr; 1차원배열
		 int[][] arr; 2차원배열
		 int[][][] arr; 3차원배열
		 
		 1차원 배열 -> for문 1번 사용
		 int[] arr = { 80, 90, 96 };
		 arr.length 3
		 arr[0]
		 arr[1]
		 arr[2]
		 
		 arr, scores 레벨 같음
		 */
		
		// 2차원 배열 생성 -> for문 2번 사용
		int[][] scores = {
				{80, 90, 96}, // 1반 scores[0]
				{76, 88}	  // 2반 scores[1]
		};
		
		// 배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length); // 행의 갯수 2
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수: " + scores[0].length); // 학생 수 3
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수: " + scores[1].length); // 학생 수 2

		// 첫 번째 반의 3번째 학생의 점수 읽어오기
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		// 두 번째 반의 2번째 학생의 점수 읽어오기
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		// 두 번째 반의 1번째 학생의 점수 읽어오기
		System.out.println("scores[1][0]: " + scores[1][0]);
		
		// 첫 번째 반의 평균점수 구하기
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균점수: " + class1Avg);
		
		// 두 번째 반의 평균점수
		int class2sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class2sum += scores[1][i];
		}
		double class2Avg = (double) class2sum / scores[1].length;
		System.out.println("두 번째 반의 평균점수: " + class2Avg);
		
		// 전체 학생의 평균점수 구하기
		int totalStudent = 0; // 학생 수
		int totalSum = 0; // 전체 학생의 총 점수
		
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
	}

}
