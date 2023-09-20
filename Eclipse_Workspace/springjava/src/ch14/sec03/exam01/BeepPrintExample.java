package ch14.sec03.exam01;

/*
스레드 : 프로그램에서 독립적으로 실행하는 단위.
하나의 프로그램은 기본적으로 1개의 스레드를 제공.
기본스레드 이름 : main스레드

프로그램이 실행할 때 JVM이	main스레드를 생성 및 동작시키고, main스레드가 담당하는 main()메소드를 실행시킨다.

기본스레드(main스레드) 하에서 main메소드의 실행순서는 작성된 코드. 즉 위에서 아래로 순차적으로 실행되는 특징.
*/
import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) { // main스레드
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 추상메소드. 객체 생성 불가.
		
		// 작업1 : 띵 소리 효과음 발생. 작업1 -> 작업2 순서로 진행.
		for(int i=0; i<5; i++) {
			toolkit.beep();
			// 0.5초 동안 일시정지하는 기능
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
		// 작업2 : "띵" 문자열 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		

	}

}
