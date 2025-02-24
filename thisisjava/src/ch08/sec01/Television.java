package ch08.sec01;

public class Television implements RemoteControl{

	// turnOn() 메소드는 인터페이스에서 public이 생략되어있어 접근제한을 붙여줘야함
	@Override
	public void turnOn() {
		System.out.println("Television On");
	}
}
