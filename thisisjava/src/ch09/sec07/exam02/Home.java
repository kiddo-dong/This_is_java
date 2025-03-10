package ch09.sec07.exam02;

public class Home {
	// 인터페이스 타입에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("Anonymous On");
		}

		@Override
		public void turnOff() {
			System.out.println("Anonymous Off");
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	// 로컬 익명 구현 객체
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("local Anonymous Class On");
			}
			@Override
			public void turnOff() {
				System.out.println("local Anonymous Class Off");
			}
		};
		// 로컬 메소드 호출
		rc.turnOn();
		rc.turnOff();
	}
	
	// 구현 객체를 매개변수로 받는 메소드
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
