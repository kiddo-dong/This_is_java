package ch08.sec04;

public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv Off");
	}

	@Override
	public void setVolume(int volume) {
		// public static final 상수필드 
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Tv volume : " + this.volume);
}

}