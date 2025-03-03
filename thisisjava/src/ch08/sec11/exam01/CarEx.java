package ch08.sec11.exam01;

public class CarEx {
	public static void main(String[] args) {
		// Car 타입 객체
		Car mycar = new Car();
		
		// Car 객체의 필드의 Tire 인터페이스에 Hankook 구현 객체가 들어 있음
		mycar.run();
		
		// Car 타입의 객체인 mycar의 필드인 tire1,2 는 Tire 인터페이스를 연결 하므로 Tire 인터페이스에 구현 객체를 연결 해줌 
		mycar.tire1 = new KumhoTire();
		mycar.tire2 = new KumhoTire();
		
		// run() 에는 tire1,2.roll() 메소드가 실행됨 즉 인터페이스의 구현 객체로 넘어감
		mycar.run();
	}
}
