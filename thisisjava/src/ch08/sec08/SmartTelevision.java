package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable{

	// 인터페이스 Searchable의 추상 메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url);
	}

	// 인터페이스 RemoteControl의 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("On");
	}

	@Override
	public void turnOff() {
		System.out.println("Off");	
	}
	
}
