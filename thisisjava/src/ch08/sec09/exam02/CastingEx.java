package ch08.sec09.exam02;

public class CastingEx {
	public static void main(String[] args) {
		
		// 인터페이스 타입의 구현객체 대입
		Vehicle vc = new Bus();
		// vc에 선언된 추상 메소드 들을 Bus 객체로 사용
		 vc.run();
		 
		 System.out.println();
		 
		 // vc 인터페이스를 Bus 구현 클래스로 타입 변환
		 Bus bus = (Bus) vc;
		 // 즉, Bus bus = new Bus();
		 
		 bus.run();
		 bus.checkFare();
		
	}
}
