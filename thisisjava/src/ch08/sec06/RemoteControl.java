package ch08.sec06;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("mute");
			setVolume(MIN_VOLUME); // 추상 메소드 호출, 구현 객체가 존재해야 실행가능
		} else {
			System.out.println("unmute");
		}
	}
	
	static void changeBettery() {
		System.out.println("Change Battery from interface");
	}
}	