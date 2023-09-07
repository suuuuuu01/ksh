package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// 배열의 초기값
		
		int[] arr1 = new int[3]; // new int[배열크기]

		for(int i=0; i<arr1.length; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ",");
		}
		
		System.out.println();
		
		// 배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ",");
		}
		
		System.out.println("\n");
		
		double[] arr2 = new double[3];
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ",");
		}
		
		System.out.println("\n");
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ",");
		}
		
		System.out.println();
		
		String[] arr3 = new String[3]; // 참조타입 배열의 초기값은 null
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ",");
		}
		
		System.out.println();
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(" arr3[" + i + "] : " + arr3[i] + ",");
		}
		
		// for문이 반복
		// 메서드 3개를 정의해서, arr1, arr2, arr3 초기값과 변경된 값을 출력하는 메소드 3개 만들기
		
	}
	
}
