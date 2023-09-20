package ch14.sec06.exam01_2;

// 공유자원이 있는 클래스 용도.
public class Calculator {
	private int memory; // 공유필드 : user1Thread 스레드가 100 저장. user2Thread 스레드가 50으로 변경.
	
	public int getMemory() {
		return memory;
	}
	// 동기화하는 작업은 여러가지가 있다.
	
	// 공유자원을 접근하는 메소드에 동기화 작업을 해야 한다.
	// 동기히ㅘ 메소드
	public void setMemory1(int memory) { // synchronized 필요없음.
		this.memory = memory;
		
		try { Thread.sleep(2000); } catch (InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	public void setMemory2(int memory) {
		synchronized (this) {
			
		}
		this.memory = memory;
		
		try { Thread.sleep(2000); } catch (InterruptedException e) {}
		
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
