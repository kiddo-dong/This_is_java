package ch06.sec08.exam04;

public class CalEx {
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		double result1 = myCal.ar_Rec(10);
		double result2 = myCal.ar_Rec(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
		
		int result3 = myCal.ar_Rec(10);
		System.out.println(result3);
	}	
}