package ch07.sec06.package2;

import ch07.sec06.package1.A;

// 다른 패키지에서 A 클래스 상속
public class D extends A{
	// 생성자 생략가능
	public D() {
		//상속받은 클래스 이므로 부모생성자 호출
		super(); // 생략가능
	}
	// 생성자 생략가능
	
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	public void method2() {
		// 직접 객체 생성 후 사용 불가능
		/*
		A a = new A();
		a.field = "value";
		a.method();
	*/
	}
}
