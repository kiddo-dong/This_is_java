package ch08.sec12;

// Vehicle의 구현 객체
public class Taxi implements Vehicle{

	// 추상 메소드 오버라이딩
	@Override
	public void run() {
		System.out.println("택시가 달림");
	}

}
