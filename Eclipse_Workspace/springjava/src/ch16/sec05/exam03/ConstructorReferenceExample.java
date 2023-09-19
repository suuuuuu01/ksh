package ch16.sec05.exam03;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 람다식
//		Member m1 = person.getMember1((id) -> new Member(id)); // { return new Member(id);});에서 생략처리
		// 메소드 참조
		Member m1 = person.getMember1(Member :: new); // new Member(String id) 생성자  생략됨. // (람다식 재정의 -> 메소드 참조) Creatable1
		System.out.println(m1);
		System.out.println();

		// 람다식
//		Member m2 = person.getMember2((id, name) -> new Member(id, name)); // {return new Member(id, name);});
		// 메소드 참조
		Member m2 = person.getMember2(Member :: new); // new Member(String id, String name) 생성자 생략됨.
		System.out.println(m2);
	}

}
