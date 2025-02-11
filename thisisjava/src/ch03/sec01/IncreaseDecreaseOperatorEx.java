package ch03.sec01;

public class IncreaseDecreaseOperatorEx {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x = 10 연산 후 x = 11
		++x; // x = 12
		System.out.println(x); // 12
		
		System.out.println("===========================");
		y--; // y = 10 연산 후 y = 9
		--y; // y = 8
		System.out.println(y); // y = 8
		
		System.out.println("===========================");
		z = x++; // x = 12, z = 12 연산 후 x = 13
		System.out.println(z); // z = 12
		System.out.println(x); // x = 13
		
		System.out.println("===========================");
		z = ++x; // x = 14, z = 14
		System.out.println(z); // z = 14
		System.out.println(x); // x = 14
		
		System.out.println("===========================");
		z = ++x + y++; // x = 15, y = 8, z = 23 연산 후 y = 9
		System.out.println(z); // z = 23
		System.out.println(x); // x = 15
		System.out.println(y); // y = 9
		
	}
}
