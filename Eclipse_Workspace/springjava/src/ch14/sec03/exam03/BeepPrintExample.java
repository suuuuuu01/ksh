package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// 작업자 스레드 생성방법2
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				// 작업. 띵 소리
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					// 0.5초 동안 일시정지하는 기능
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
			
		};
		
		thread.start();
		
		// main스레드에서 관리.
		// 작업. 띵 소리 출력. main스레드 작업
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					// 0.5초 동안 일시정지하는 기능
					try { Thread.sleep(500); } catch(Exception e) {}
				}

	}

}
