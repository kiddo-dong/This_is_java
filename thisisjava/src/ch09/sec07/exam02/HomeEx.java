package ch09.sec07.exam02;

public class HomeEx {
	public static void main(String[] args) {
		Home home = new Home();
		// 익명 구현 객체 호출 메소드
		home.use1();
		// 로컬 익명 구현 객체 메소드
		home.use2();
		
		// 매개변수가 익명 구현 객체인 메소드
		home.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("매개변수 Anonymous Class On");
			}
			@Override
			public void turnOff() {
				System.out.println("매개변수 Anonymous Class Off");
			}
		});
	}
}
