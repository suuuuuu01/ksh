package ch02.sec06;

public class TextBooleanExample {

	public static void main(String[] args) {
		String str = "" +
					"{\n" +
					"\t\"id\":\"winter\",\n" +
					"\t\"name\":\"눈송이\"\n" +
					"}";
		
		/* java13버전에서부터 지원. 텍스트블록문법.. 현재 java8(jdk1.8)에서는 에러.
		String str2 = """
		 
			{
					"id":"winter",
					"name":"눈송이"
			}
		""";
		*/
		
		System.out.println(str);

	}

}
