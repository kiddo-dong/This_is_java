package ch08.sec09.exam02;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("구현 클래스(Bus)의 run메소드");
	}
	
	// Bus 자체의 메소드 
	public void checkFare() {
		System.out.println("checkFare 메소드");
	}
	
}
