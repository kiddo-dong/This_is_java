package ch08.sec12;

public interface InstanceofExample {
	public static void main(String[] args) {
		
		// 구현 객체 생성
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		// bus 객체를 대입
		ride(b);
		
		System.out.println();
		// taxi 객체를 대입
		ride(t);
		
	}
	
	//인터페이스 매개변수를 가지는 정적 메소드
	public static void ride(Vehicle vh) {
		
		// vh 변수가 Bus 타입의 객체라면 실행(true 시 실행)
		if(vh instanceof Bus bus) {
			bus.checkFare(); // Bus의 메소드인 checkFare 메소드 호출
		}
		
		vh.run();
	}
}
