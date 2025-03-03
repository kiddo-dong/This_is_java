package ch08.sec11.exam02;

public class Driver {
	// 인터페이스 타입의 매개변수 v 선언 v에 들어오는 구현 객체 마다 메소드 안의 내옹이 달라짐
	void drive(Vehicle v) {
		v.run();
	} 
}
