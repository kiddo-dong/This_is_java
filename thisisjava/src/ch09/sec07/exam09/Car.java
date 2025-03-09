package ch09.sec07.exam09;

public class Car {
	// 필드 선언
	private Tire tire1 = new Tire();
	// 익명 자식 객체 필드 선언
	private Tire tire2 = new Tire() {
		// 부모 Tire클래스 roll메소드 오버라이딩
		@Override
		public void roll() {
			System.out.println("tire 익명 자식 객체 1");
		};
	};
	// 메소드
	void run1() {
		tire1.roll(); // 필드
		tire2.roll(); // 익명 자식 객체 필드
	}
	
	// 메소드
	public void run2() {
		// 로컬변수에 익명 자식객체 대입
		Tire tire3 = new Tire() {
			@Override
			public void roll() {
				System.out.println("tire 익명 자식 객체 2");
			}
		};
	tire3.roll(); // 익명 자식 객체에서 오버라이딩 된 메소드 호출
	}
	
	// Tire(부모 및 자식)타입의 매개변수
	public void run3(Tire tire) {
		// 매개값(객체)의 roll메소드 출력
		tire.roll();
	}
	
}
