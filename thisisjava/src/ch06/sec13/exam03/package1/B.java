package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 2;
		a.field2 = 2;
		
		//필드 private 접근제한으로 사용불가
		//a.field3 = 2;
		
		a.method1();
		a.method2();
		
		//메소드 private 접근제한으로 사용불가
		//a.method3();
	}
}
