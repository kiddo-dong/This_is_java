package ch07.sec04.exam01;

public class ComputerEx {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("부모클래스의 메소드 원주율 : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("자식클래스의 오버라이딩된 메소드 원주율 : " + com.areaCircle(r));
	}
}
