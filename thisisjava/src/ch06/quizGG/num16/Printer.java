package ch06.quizGG.num16;

public class Printer {
	
	//method overloading
	private static void println(int a) {
	}
	
	private static void println(boolean a) {
	}
	
	private static void println(double a) {
	}
	
	private static void println(String a) {
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		println(10);
		println(true);
		println(5.7);
		println("홍길동");
	}
}