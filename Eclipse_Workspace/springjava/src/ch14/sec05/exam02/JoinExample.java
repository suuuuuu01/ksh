package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread(); // 스레드상태 : New
		sumThread.start(); // 스레드상태 : runnable(대기) -> CPU로 스케줄링에 의하여, CPU를 받아 설렝
		
		try {
			// main스레드가 일시정지상태가 된다.sumThread스레드가 동작이 완료되면, main스레드는 대기 상태
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("1~100 합 : " + sumThread.getSum());

	}

}
