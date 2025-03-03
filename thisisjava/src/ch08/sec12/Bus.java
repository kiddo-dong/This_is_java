package ch08.sec12;

// Vehicle의 구현 객체
public class Bus implements Vehicle{

	// 추상 메소드 오버 라이딩
	@Override
	public void run() {
		System.out.println("버스가 달림");
	}
	
	public void checkFare() {
		System.out.println("checkFare method run()");
	}
	
}
