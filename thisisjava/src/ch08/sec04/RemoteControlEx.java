package ch08.sec04;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
	}
}
