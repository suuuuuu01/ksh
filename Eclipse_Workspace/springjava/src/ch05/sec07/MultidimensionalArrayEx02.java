package ch05.sec07;

public class MultidimensionalArrayEx02 {

	public static void main(String[] args) {
		
		/*
		 int[][] mathScores = new int[행의 수][열의수 ];
		 */
		
		// int형 배열은 초기값이 0으로 만들어진다.
		int[][] mathScores = new int[2][3]; // 2*3 (2행 3열의 2차원 배열구조)
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k] );
			}
		}
		System.out.println();
		
		// 배열 항목의 값 변경
		// 첫 번째 행
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		// 두 번째 행
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
		
		// for
		for(int i=0; i<mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			for ( int k=0; k<mathScores[i].length; k++) {
				totalMathSum += mathScores[i][k];
			}
		}
			
		// 평균점수
		double totalAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수는: " + totalAvg);
		System.out.println();		
		
		// 가변배열(jagged array) : 행마다 열의 크기가 다르게 사용되는 특징. 톱모양
		int[][] englishScores =  new int[2][]; // [] : 열의 크기를 생략. 하단 두 줄을 반드시 작업해야 함.
		englishScores[0] = new int[2]; // 첫 번째 행은 열의 크기를 2로 설정
		englishScores[1] = new int[3]; // 두 번째 행은 열의 크기를 3으로 설정
		
		for(int i=0; i<englishScores.length; i++) {			
			for ( int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
			}
		}
		System.out.println();
		// 첫 번째 행
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		// 두 번째 행
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		totalStudent = 0;
		int totalenglishSum = 0;
		
		// for
		for(int i=0; i<englishScores.length; i++) {
			totalStudent += englishScores[i].length;
			for(int k=0; k<englishScores[i].length; k++) {
			totalenglishSum += englishScores[i][k];
			}
		}
		double totalEnglishAvg = (double) totalenglishSum / totalStudent;
		System.out.println("전체 학생의 영어 평균 점수는: " + totalEnglishAvg);	

	}
}