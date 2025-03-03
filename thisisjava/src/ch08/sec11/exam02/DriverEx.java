package ch08.sec11.exam02;

public class DriverEx {
	public static void main(String[] args) {
		
	// 객체 d 선언
	// 객체 d의 drive 메소드는 interface을 연결하여 구현 객체를 사용 할 수 있음.
	Driver d = new Driver();
	
	Bus bus = new Bus();
	Taxi taxi = new Taxi();
	
	
	// 다형성 형성됨. 메소드 오버라이딩 + 자동 타입 변환
	// drive(Vehicle v){}
	// 매개변수로 구현 객체인 bus와 taxi가 대입 가능함
	d.drive(bus);
	d.drive(taxi);
	
	}
}