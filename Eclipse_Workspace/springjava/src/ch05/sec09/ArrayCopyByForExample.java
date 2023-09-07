package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// 배열은 크기를 변경 불가능
		// 배열복사
		
		// 원본 : 길이가 3인 배열
		int[] oldIntArray = {1, 2, 3};
		
		
		// 수많은 작업
		
		
		// 사본 : 길이가 5인 배열
		int[] newIntArray = new int[5]; // 배열은 int형이므로 초기값이 0으로 설정.
		
		// 배열출력 : 배열 복사 이전
		for(int i=0; i<newIntArray.length; i++) {
		System.out.println(newIntArray[i] + ",");
		}
		
		System.out.println();

		// 배열복사. 
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		// 배열출력 : 배열 복사 이후
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ",");
		}

	}

}
