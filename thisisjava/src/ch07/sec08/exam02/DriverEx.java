package ch07.sec08.exam02;

public class DriverEx {
	public static void main(String[] args) {
		
	Driver der = new Driver();
	
	Vehicle v = new Vehicle();
	der.drive(v);
	
	Bus b = new Bus();
	// der.drive(new Bus()); 와 동일
	// Vehicle 타입으로 자동 타입 변환
	der.drive(b);
	
	Taxi t = new Taxi();
	der.drive(t);
	// der.drive (Vehicle t = new Taxi()); 와 동일
	
	// Vehicle 타입, Taxi의 메소드 필드 참조하는 vv변수 
	Vehicle vv = new Taxi();
	der.drive(vv);
	}
}