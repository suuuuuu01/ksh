package ch04;

public class GuGuDan {

	public static void main(String[] args) {
		// 구구단 예제 실습
		
		// System.out.println(); // 줄바꿈 있음
		// System.out.print(); // 줄바꿈 없음
		// System.out.printf(); // 포맷터 기능
		
		for(int i = 0; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				if(i == 0) {
					System.out.printf("[  %d 단 \t]", j);					
				}else {
				System.out.printf("%d*%d=%2d\t", j, i , j*i);
				}
			}
			System.out.println();
		}
	}
}
	
