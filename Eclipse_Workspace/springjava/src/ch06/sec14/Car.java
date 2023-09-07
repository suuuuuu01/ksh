package ch06.sec14;

// getter, setter 예제 
// 목적? 필드를 private접근자로 사용하여, 직접접근을 막고, 
// getter, setter메소드를 통한 간접접근으로 사용하고자 한다.
// 직접접근 : myCar.speed = -50; 잘못된 값을 사용하는 것을 막음.
// tool : source - generate getter and setter
public class Car {

	// 필드선언
	private int speed; //0
	private boolean stop; // false

	// speed 필드의 getter / setter
		// Getter
		public int getSpeed() {
			return speed;
		}
		
		// Setter 무조건 void
		public void setSpeed(int speed) {
			if(speed < 0) {
				this.speed = 0;
				return;
			}else {
				this.speed = speed;
			}
		}
		
		// stop 필드의 getter/setter
		
		public boolean isStop() { // get (X), is (O)
			return stop;
		}
		
		public void setStop(boolean stop) {
			this.stop = stop;
			if(stop == true) this.speed = 0;
		}
	
}
