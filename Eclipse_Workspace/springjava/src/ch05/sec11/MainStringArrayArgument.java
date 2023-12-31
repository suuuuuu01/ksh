package ch05.sec11; // 명령 프롬프트 환경에서 파일을 단독으로 실행 시에는 이 줄은 복사에서 제외된다.

/*
 명령프롬프트기반에서 파일을 독립적으로 실행
 javac MainStringArrayArgument.java
 java MainStringArrayArgument 10 20
 */

/*
 현재 이클립스 예제는 Run 메뉴 - Run Configuration에서 클래스 MainStringArrayArgument 확인
 				- Argument 매개변수값 입력 10 20 - Run 클릭
 */
public class MainStringArrayArgument {

	public static void main(String[] args) {
		// JVM 구동되면서, 자바프로그램의 main() 시작메소드를 호출한다.
		// String[] args 사용법. 
		// : run - run configurations - 파일명 확인 - arguments - program arguments에 메인메소드에 대입할 값 입력
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0); // 프로그램을 종료하는 기능
		}
		
		// main() 메소드의 매개변수를 2개 제공한 경우
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// 문자열을 정수형으로 변환. ex) "10" -> 10으로 변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}

}
