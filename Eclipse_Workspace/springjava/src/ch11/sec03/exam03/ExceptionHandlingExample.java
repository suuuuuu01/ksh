package ch11.sec03.exam03;

// 다중예외처리 예제 - 실행 시 오류가 2개 이상 존재했을 때 예외처리하는 문법.
// 배열의 array[1] 값이 숫자형태의 문자열이 아니므로 정수변환 시 예외 발생 NumberFormatException -> Exception 대체함.
// 배열의 array[2] 인텍스가 존재하지 않아, 예외 발생 ArrayIndexOutOfBoundsException
// 다중예외처리 시 catch()구문에서 상위예외클래스가 뒤에 작업이 되어야 한다. (20번 중복)
public class ExceptionHandlingExample {

	public static void main(String[] args) {

		String[] array = {"100", "1oo", null, "200"}; // 알파벳 o를 입력
		
		for(int i=0; i<=array.length; i++) {
				try {
					int value = Integer.parseInt(array[i]); // array[2]
					System.out.println("array[" + i + "]: " + value);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			}catch (NumberFormatException | NullPointerException e) { // catch 두 구문 합치기
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			}
		}
	}

}
