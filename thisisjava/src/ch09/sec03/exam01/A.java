package ch09.sec03.exam01;

public class A {
	
	//Nested class
	static class B {
		void methodB() {
			System.out.println("methodB() 실행");
		}
	}

	// A class field
	B field1 = new B();
	
	// 정적 클래스 이므로 객체 없이 사용 가능
	static B field2 = new B();
	
	// constructor
	A(){
		B field1 = new B();
	}
	
	//method
	void method1() {
		B field1 = new B();
	}	
	
	static void method2() {
		B field = new B();
	}
	
}