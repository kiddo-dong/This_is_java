package ch09.sec04.exam02;

public class A {
	
	//메소드 선언 
	void useB() {
		
		// 로컬 클래스 선언
		class B{
			
			// 필드
			int field1 = 1;
			static int field2 = 2;
			
			// 생성자 
			B(){
				System.out.println("B-local class 생성자");
			}
			
			//메소드
			void method1() {
				System.out.println("B- 메소드");
			}
			static void method2() {
				System.out.println("B- static 메소드");
			}
		}
		B b = new B();
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
	}
}
