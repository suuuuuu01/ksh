package ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();

		// 1) 정적메소드일 경우
		
		// 람다식
//		person.action((x, y) -> Computer.staticMethod(x, y));
		
		// 메소드 참조
		person.action(Computer :: staticMethod); // 람다식 문법 9번 라인을 (메소드)참조식으로 바꾸기 
		
		
		// 2) 인스턴스 메소드일 경우
		
		Computer computer = new Computer(); // 객체 생성
		// 람다식
//		person.action((x,y)-> computer.instanceMethod(x, y));
		
		// 메소드 참조
		person.action(computer :: instanceMethod); // 참조변수 :: 메소드 (20번라인으로 적어도 18번으로 동작.)
	}

}
