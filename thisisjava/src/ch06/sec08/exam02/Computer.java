package ch06.sec08.exam02;

public class Computer {
	// 가변길이 메소드
	// 메소드리턴타입 메소드명(매개변수타입 ... 매개변수) {}
	int sum(int ... values) {
		int sum = 0;
		
		for(int i=0; i<values.length;i++) {
			sum += values[i];
		}
		
		return sum;
	}	
}