package ch07.sec04.exam02;

public class AirplaneEx {
	public static void main(String[] args) {
		Airplane sa = new Airplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flymode = sa.SUPERSONIC;
		sa.fly();
		
		sa.flymode = sa.NOMAL;
		sa.fly();
		
		sa.land();
	}
}
