package ch07.sec09;

public class InstanceofExample {

	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
//		if(person instanceof Student) {
//			System.out.println("Student객체입니다.");
//		}else {
//			System.out.println("Student객체가 아닙니다.");
//		}
		// personInfo(p1) 호출 시 false, personInfo(p2) 호출 시 true
		if(person instanceof Student) {
			Student student = (Student)person; 
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
		// jdk 12 version
		/*
		if(person instanceof Student Student) {
			System.out.println("studentNo: " + Student.studentNo);
			student.study();
		}
		*/
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		// person instanceof Student -> false
		personInfo(p1); // new 연산자가 힙영역에 생성한 기억장소의 주소가 전달
		
		Person p2 = new Student("손흥민", 10); // 자동형변환
		// person instanceof Student -> true
		personInfo(p2);
	}

}
