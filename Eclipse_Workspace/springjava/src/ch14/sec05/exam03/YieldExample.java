package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");

		workThreadA.start();
		workThreadB.start();
		
		// 5초간 일시정지. main스레드
		try { Thread.sleep(5000); } catch (InterruptedException e) {}
		workThreadA.work = false; // workThreadA는 대기상태가 되고, 다른 스레드에게 양보.
		
		try { Thread.sleep(5000); } catch (InterruptedException e) {}
		workThreadA.work = true;
	}

}
