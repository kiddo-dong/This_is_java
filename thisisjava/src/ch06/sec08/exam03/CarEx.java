package ch06.sec08.exam03;

public class CarEx {
	public static void main(String[] args) {
		// 객체 선언 및 초기화
		Car myCar = new Car();
		// 매개변수 5
		myCar.setGas(5);
		
		// 리턴값이 true 시 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
		
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요");
	}
}