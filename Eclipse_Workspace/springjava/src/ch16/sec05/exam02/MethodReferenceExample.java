package ch16.sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
//		person.ordering((a,b) -> a.compareToIgnoreCase(b)); // 람다식 문법
		
		person.ordering(String :: compareToIgnoreCase); // 메소드 참조

	}

}
