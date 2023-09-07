package ch07.sec08.exam01;

// 자동차 회사 조립과정
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // 차 생산
		
		myCar.tire = new Tire();
		myCar.run(); // 기본 타이어
		
		myCar.tire = new HankookTire(); // 타이어 장착. 형변환.
		myCar.run();
		
		// .......타이어 변경사항. 
		myCar.tire = new KumhoTire();// 타이어 장착. 형변환.
		myCar.run();
	}

}
