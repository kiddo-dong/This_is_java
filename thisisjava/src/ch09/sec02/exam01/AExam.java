package ch09.sec02.exam01;

public class AExam {
	public static void main(String[] args) {
		// 객체 a 생성
		A a = new A();
		a.field = 10;
		
		a.methodA();
		
		A.B b = a.new B();
		b.methodB();
		
		

	}
}
