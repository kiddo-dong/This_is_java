package ch03.sec09;

public class BitShiftEx {
	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3); //거듭제곱 함수 Math.pow()
		System.out.println(result1);
		System.out.println(result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2,3);
		System.out.println(result3);
		System.out.println(result4);
	}
}
