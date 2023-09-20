package ch14.sec05.exam02;

// 이 클래스를 스레드작업으로 사용
public class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		this.sum = sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		// 작업 : 1 ~ 100까지의 합
		for(int i=1; i<=100, i++) {
			sum+=i;
		}
		super.run();
	}
}
