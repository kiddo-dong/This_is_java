package ch09.sec05.exam01;

public class A {
	// A 클래스의 필드, 메소드
	int field1;
	void method1() {}

	static int field2;
	static void method2() {}
	
	// 중첩 클래스 선언
	// 인스턴스 멤버 클래스
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	// 정적 중첩 클래스 선언
	// 정적 멤버 클래스
	static class C {
		void method() {
			// field1, method1()은 객체가 존재해야 사용가능하지만 C클래스는 객체가 없이 사용되므로 사용할 수 없다.
			
			field2 = 10;
			method2();
		}
	}
		
	
}
