package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

// Random 예제
// Random random = new Random(3); 고정된 값
// random = new Random(); 랜덤값

public class RandomExample {

	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber = new int[6]; // 기본값 0
		Random random = new Random(3); // 종자값 = 정해진 랜덤값이 나타남. 종자값을 빼면 랜덤값으로 나타남.
		System.out.println("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; // 1~45 범위의 값
			System.out.println(selectNumber[i] + " ");
		} // 18, 8, 4, 29, 13, 31
		System.out.println();
		
		// 당첨번호
		int[] winningNumber = new int[6]; // 기본값 0
		random = new Random(); // 종자값. 
		System.out.println("선택번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1; // 1~45 범위의 값
			System.out.println(winningNumber[i] + " ");
		} // 18, 38, 45, 15, 22, 36
		
		// 당첨여부
		// 오름차순 정렬
		Arrays.sort(selectNumber); // 4, 8, 13, 18, 29, 31
		Arrays.sort(winningNumber); // 15, 18, 22, 36, 38, 45
		boolean result = Arrays.equals(selectNumber, winningNumber);
		if(result) {
			System.out.println("1등에 당첨");
		}else {
			System.out.println("당첨이 안 됌..");
		}
	}

}
