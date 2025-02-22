package ch07.sec05;

public class SportCar extends Car{
	
	@Override
	public void speedUp() {
		speed+=10;
	}
	
	// stop 메소드는 부모 클래스에서 final선언이므로 재정의 불가능'
	// @Override
	/* public void stop() {
		System.out.println("Sp 멈춤");
		speed = 0;
	}
	*/
}
