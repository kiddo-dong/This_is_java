package ch08.sec04;

// 인터페이스 선언
public interface RemoteControl {
	// public static final 생략된 상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME= 0;
	
	// public adstract 생략된 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
