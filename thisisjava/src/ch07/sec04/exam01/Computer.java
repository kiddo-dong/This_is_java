package ch07.sec04.exam01;

public class Computer extends Calculator{
	
	// areaCircle 메소드 오버라이딩
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer클래스의 areaCircle실행");
		return Math.PI * r * r;
	}
}
