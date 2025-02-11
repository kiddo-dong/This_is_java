package ch03.sec02;

public class ArithmeticOperatorEx {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;
		System.out.println(result1); // 14
		
		long result2 = v1 + v2 - v4; 
		System.out.println(result2);// 9
		
		double result3 = (double)v1 / v2;
		System.out.println(result3); // 2.5
		
		int result4 = v1 % v2;
		System.out.println(result4); // 2
	}
}
