package ch09.sec03.exam02;

public class Aexam {
	public static void main(String[] args) {
		A.B b = new A.B();
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println("====== static ======");
		
		System.out.println(A.B.field2);
		A.B.method2();
	}
}
