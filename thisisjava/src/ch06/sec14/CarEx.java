package ch06.sec14;

public class CarEx {
	public static void main(String[] args) {
		
		// 객체 myCar 생성
		Car myCar = new Car();
		
		// 생성된 객체 myCar에 대한 public 메소드 setSpeed호출
		myCar.setSpeed(-50);
		// setSpeed에 매개값 -50 및 메소드 수행
		// 메소드 수행 후 myCar객체의 speed는 0 .
		
		// myCar의 getSpeed()메소드 수행
		System.out.println("현재속도 : " + myCar.getSpeed());
		// 리턴값으로 speed의 값 리턴
		
		myCar.setSpeed(60);
		System.out.println("현재속도 : " + myCar.getSpeed());

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도 : " + myCar.getSpeed());
		
	}
}
