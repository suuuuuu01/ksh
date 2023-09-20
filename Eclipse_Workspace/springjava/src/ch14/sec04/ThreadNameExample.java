package ch14.sec04;

/*
작업자스레드 기본이름 : thread-n 예> thread-0, thread-1, thread-2, thread-3,...
작업자스레드 이름 정의하기.
*/
public class ThreadNameExample {

	public static void main(String[] args) {
		// 현재 동작 중인 스레드를 참조.
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + "실행");
	
		// 스레드 기본이름
		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + "실행");
				}
			};
			// 스레드 상태 : start()메소드가 실행되기 전까지 스레드상태를 New라고 한다.
			
			threadA.start(); // 실행이 되면, 스레드는 스레드 상태가 대기상태로 존재한다. run()메소드가 즉시 호출이 되지 않는다.
		}
		
		// 스레드 이름 정의하기
		Thread chatThread = new Thread() {
			@Override
			public void run() {
			System.out.println(getName() + "실행");
			}
		};
		chatThread.setName("chat-thread");
		chatThread.start();
		
	}

}
