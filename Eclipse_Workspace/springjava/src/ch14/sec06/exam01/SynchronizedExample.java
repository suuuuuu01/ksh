package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		// 스레드 2개(user1Thread, user2Thread)가 calculator객체를 공유하고 있다.
		
		// 주소 : 100번지
		Calculator calculator = new Calculator(); // 공유객체.
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator); // 100번지 전달.
		user1Thread.start(); // run()메소드 호출 (100으로 변경)
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator); // 100번지 전달.
		user2Thread.start(); // run()메소드 호출 (50으로 변경)
	}

}
