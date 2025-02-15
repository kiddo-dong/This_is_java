package ch07.sec03.exam02;

public class Phone {
	public String model;
	public String color;
	
	// 매개변수가 존재하는 부모 클래스 생성자
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("부모 클래스 생성자 실행");
	}
}
