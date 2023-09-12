package ch11.sec05;

// 예외 떠넘기기(예외 전가)
public class ThrowsExample1 {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			System.out.println("예외 처리: " + e.toString()); // try{} catch(){} = 예외처리
		}

	}
	
	// 예외 전가 : throws ClassNotFoundException
	// 이 메소드를 호출한 쪽으로 예외 떠넘기기 작업. 
	public static void findClass() throws ClassNotFoundException {
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
