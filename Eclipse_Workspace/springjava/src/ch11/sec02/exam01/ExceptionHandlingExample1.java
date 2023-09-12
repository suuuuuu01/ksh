package ch11.sec02.exam01;

// 예외처리가 안 된 예제.
// 예외발생되어 프로그램이 비정상 종료가 됨.
public class ExceptionHandlingExample1 {

	public static void printLenth(String data) {
		int result = data.length(); // 참조연산자는 주소값을 가지고 있을 때 사용
		System.out.println("문자 수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLenth("ThisIsJava");
		printLenth(null); // 예외발생 -> 비정상적인 종료.
		System.out.println("[프로그램 종료]"); // 이 라인은 위에서 예외발생이 되어, 정상적인 실행 불가
	}

}
