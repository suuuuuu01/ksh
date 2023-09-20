package ch14.sec06.exam01;

// 스레드로 사용할 클래스
public class User2Thread extends Thread {
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator; // 100번지
	}
	
	@Override
	public void run() {
		calculator.setMemory1(50);
	}
}
