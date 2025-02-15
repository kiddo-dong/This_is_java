package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	public SmartPhone(String model, String color) {
		super(model, color);
		this.model = model;
		this.color = color;
		System.out.println("자식 클래스 생성자 실행");
	}
}
