package ch08.sec11.exam01;

public class Car {
	// 인터페이스 타입의 필드 선언 및 초기화
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
