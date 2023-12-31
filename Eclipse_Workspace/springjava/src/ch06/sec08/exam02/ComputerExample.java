package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		// 객체 myCom		
		Computer myCom = new Computer(); // computer.java 6번 sum 정보 존재
		
		// 매개변수를 3개
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1 : " + result1);
		
		// 매개변수를 5개
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2 : " + result2);
		
		int[] values = {1, 2, 3, 4, 5};
		// 매개변수를 배열로 사용 가능.
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result4 : " + result4);

	}

}
