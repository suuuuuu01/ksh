package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// String 데이터타입 : 문자열 데이터를 저장하는 목적
		// 큰따옴표 사용.
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		//Escape 특수문자 사용. \와 같이 사용.
		
		String str = "나는 \"자바과정\"을 잘 수료해서, 개발자로 나간다";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다.\n");

	}

}
