package ch09.sec07.exam09;

public class TireEx {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.run1(); // tire1.roll(); | tire2.roll();
		
		c.run2(); // Tire tire3 = new Tire(){}; (로컬 변수) overriding
		
		// Car 클래스의 run3(Tire tire) 메소드 Tire 타입의 객체 매개변수(부모, 자식)
		c.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("tire 익명 자식 객체 3");
			}
		});
	}
}
