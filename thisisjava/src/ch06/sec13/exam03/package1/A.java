package ch06.sec13.exam03.package1;

public class A {
	// public 필드 선언 (모든 패키지)
	public int field1;
	
	// default 필드 선언 (패키지에서)
	int field2;
	
	// private 필드 선언 (클래스에서만)
	private int field3;
	
	// 생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
	
		method1();
		method2();
		method3();
	}
	// public 권한
	public void method1() {
		
	}
	
	// default 권한
	void method2() {
		
	}
	
	// private 권한
	private void method3() {
		
	}
	

}
