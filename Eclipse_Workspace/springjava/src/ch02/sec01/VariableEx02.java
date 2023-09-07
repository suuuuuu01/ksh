package ch02.sec01;

public class VariableEx02 {

	public static void main(String[] args) {
		int hour = 3; // 변수선언 시 대입한 값을 초기값이라고 한다.
		int minute = 5;

		// System.out.println() : 변수 또는 값을 콘솔에 출력 시 사용하는 기능.
		System.out.println(hour + "시간" + minute +"분");
		
		// 3시간 5분의 총 분? 
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");

	}

}
