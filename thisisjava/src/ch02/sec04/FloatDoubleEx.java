package ch02.sec04;

public class FloatDoubleEx {
	
// 실수 타입에는 float와 double이 있다.
	public static void main(String[] args) {
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println(var1);
		System.out.println(var2);
	
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}
