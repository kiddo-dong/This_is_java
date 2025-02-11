package ch02.sec08;

public class CastingEx {
	public static void main(String[] args) {
		// 강제 타입 변환 (casting, 캐스팅)
		// 큰 타입 -> 작은 타입 변환
		// 캐스팅 연산자 (int) (byte)
		// int형을 byte로 캐스팅하면 4byte인 int형의 뒤의 3byte를 제거하고 앞의 1byte만 가져옴
		int var1 = 10;
		byte var2 = (byte)var1;
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int)var7;
		System.out.println(var8);
		
		float var9 = 3.1415926535F;
		int var10 = (int)var9;
		System.out.println(var10);
	}
}
