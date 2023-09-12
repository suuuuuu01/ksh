package ch11.sec02.exam01;

// 8번 라인(data.length();)에 예외가 발생되어 예외처리를 적용한 예제.
public class ExceptionHandlingExample2 {

	public static void printLenth(String data) {
		try {
			int result = data.length(); // 참조연산자는 주소값을 가지고 있을 때 사용
			System.out.println("문자 수: " + result);
		}catch(NullPointerException e) { // (매개변수 선언)
			System.out.println(e.getMessage());
		}finally { // 예외발생 여부와 상관없이 실행하고자 할 때 사용.
			System.out.println("[마무리실행]");
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLenth("ThisIsJava");
		printLenth(null); // 예외발생 -> 비정상적인 종료.
		System.out.println("[프로그램 종료]"); // 이 라인은 위에서 예외발생이 되어, 정상적인 실행 불가
	}

}
