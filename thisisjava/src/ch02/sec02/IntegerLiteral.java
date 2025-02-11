package ch02.sec02;

public class IntegerLiteral{
	public static void main(String[] args) {
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수
		// 타입 변수의 허용 범위를 벗어나면 에러 발생
		
		System.out.println("2진수-"+ var1 + " 8진수-"+ var2 + " 10진수-"+ var3 + " 16진수-" + var4);
	}
}
