package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		// Scanner 클래스를 사용하는 예제.
		// 기능 : 콘솔환경에서 키보드로 데이터를 입력받는 목적.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		
		// scanner.nextLine(); 이 코드가 실행되면, 키보드로 데이터를 입력받을 수 있는 상태 제공
		// 진행 : 키보드로 데이터 입력 -> 엔터키 -> 입력한 데이터가 버퍼(임시기억장소)에 저장.
		String strX = scanner.nextLine(); // 숫자를 입력해야 한다. 숫자가 아니면 에러 발생.
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		
		while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			// 입력한 데이터 q가 맞으면, 
			if(data.equals("q")) {
				break; // while문 종료
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
		
	}

}
