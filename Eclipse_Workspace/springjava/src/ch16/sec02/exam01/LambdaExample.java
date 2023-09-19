package ch16.sec02.exam01;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
//		추상메소드 람다식으로 재정의
//		person.action(추상메소드 람다식으로 재정의);
		person.action(() -> {
			System.out.println("출근합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
//		실행문이 한개 일 경우 중괄호 생략 가능. 실행문의 세미콜론(;) 도 제거해도 된다.
		person.action(() -> System.out.println("퇴근합니다"));
	
	}
}	
		/*
		Person person = new Person();
		
		// 매개변수가 2개일 경우
		person.action1((name, job) {
			System.out.println(name + "이");
			System.out.println(job + "을 합니다.");
		}); // 괄호 내(추상메소드를 람다식으로 재정의), 
		
		// 매개변수가 1개일 경우
		person.action2(word -> 
			system.out.print( "\" + word + "\" + "라고 외칩니다." + "\" );
			System.out.println("라고 말합니다.");
		);
		
		person.action2(word -> system.out.println("\" + word + "\" + "라고 외칩니다."));
		// 실행문이 한 개일 경우 중괄호 생략 가능. 실행문의 세미콜론(;)을 생략한다. // 한 줄일 때는 블록처리 안 해도 돼.
	}

}
*/