package ch07.sec02;

// 클래스 상속
public class SmartPhone extends Phone{
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	// bell
	//sendVoice 메소드 상속
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("상태변경");
	}
}	
