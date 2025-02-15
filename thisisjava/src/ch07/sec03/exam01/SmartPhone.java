package ch07.sec03.exam01;

//extends 로 부모클래스 Phone 상속
public class SmartPhone extends Phone {
	public SmartPhone(String model,String color) {
		super(); // 생략 가능 부모 생성자에 매개변수가 있을 시 super에 매개변수 대입
		
		// Superclass의 model, color 필드 상속
		this.model = model;
		this.color = color;
		System.out.println("자식 클래스 실행됨.");
	}
}
