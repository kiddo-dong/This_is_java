package ch09.sec02.exam02;

import ch09.sec02.exam02.A.B;

public class AExam {
	public static void main(String[] args) {
		// a 객체 생성 및 생성자 호출
		A a = new A();
		
		a.useB();
		
		System.out.println("\n| B클래스 객체 생성 및 사용 |");
		
		//B 클래스 객체를 생성 해보자
		A.B b = a.new B();
		System.out.println("클래스 B의 필드 : "+b.field1);
		System.out.println("클래스 B의 정적 필드 : "+ B.filed2);
		
		b.method1();
		B.method2();
	
	}
}
