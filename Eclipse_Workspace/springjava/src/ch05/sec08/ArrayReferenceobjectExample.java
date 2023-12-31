package ch05.sec08;

public class ArrayReferenceobjectExample {

	public static void main(String[] args) {
		// 배열을 사용하는 목적
		// 참조타입 배열
		
		/*
		 String str1, str2, str3
		 */		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java"); // 참조타입 사용방식(생성자 메소드)
		
		// 주소비교
		System.out.println(strArray[0] == strArray[1]); //true
		System.out.println(strArray[0] == strArray[2]); //false

		// 데이터비교(값)
		System.out.println(strArray[0].equals(strArray[2])); //true
		
		// 배열의 크기(길이) 변경 불가능.
		// length 속성은 get 지원. set 지원 안 함.
//		strArray.length = 30;
		
	}

}
