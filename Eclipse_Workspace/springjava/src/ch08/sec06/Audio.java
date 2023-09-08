package ch08.sec06;

public class Audio implements RemoteControl {

	// 인터페이스를 상속받는 클래스는 인터페이스의 추상메소드를 구형해야 하는 문법적인 규칙 때문에 툴에서 이 작업을 제공 
	
	// 필드. 현재 오디오 볼륨상태.
	private int volume;
		
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		// 볼륨. 최대 10, 최소 0
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 볼륨상태: " + volume);
	}
	
	// 필드
	private void memoryVolume() {
		
	}

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음을 해제합니다.");
			setVolume(this.memoryVolume);
		}

	}

}
