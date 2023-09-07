package ch07.sec08.exam01;

// 바퀴(타이어) 제조업체
public class HankookTire extends Tire{
	
	// 재정의
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		super.roll();
		System.out.println("한국 타이어가 회전합니다.");
	}
}
