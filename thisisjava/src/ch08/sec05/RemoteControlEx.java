package ch08.sec05;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc;
		
		
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		
		System.out.println();
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(7);
		
		//오버라이딩 된 default 메소드
		rc.setMute(true);
		rc.setMute(false);
		
		rc.turnOff();
	}
}
