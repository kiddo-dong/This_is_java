package ch06.sec08.exam04;

public class Calculator {
	// 메소드 오버로딩
	// 매개변수 1개
	double ar_Rec(double width) {
		return width * width;
	}
	
	// 메소드 오버로딩
	// 매개변수 2개 
	double ar_Rec(double width, double height) {
		return width * height;
	}
	
	int ar_Rec(int width) {
		return width * width;
	}
}
