package ch08.sec05;

// 인터페이스 선언
public interface RemoteControl {
	// public static final 생략된 상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME= 0;
	
	// public adstract 생략된 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("mute");
			setVolume(MIN_VOLUME); // 추상 메소드 호출, 구현 객체가 존재해야 실행가능
		} else {
			System.out.println("unmute");
		}
	}
}
