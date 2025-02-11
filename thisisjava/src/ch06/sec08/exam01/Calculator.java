package ch06.sec08.exam01;

public class Calculator {
	
	// void -> 메소드의 리턴값이 없음
	// 메소드명 powerOn, 매개변수 없음
	void powerOn() {
		System.out.println("전원 On");
	}
	
	void powerOff() {
		System.out.println("전원 Off");
	}
	
	//int -> 리턴 타입 int (기본타입) 
	//메소드명 plus
	//매개변수 x, y
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	//double -> 리턴 타입 double(기본타입)
	//메소드명 divide
	// 매개변수 x, y
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
}