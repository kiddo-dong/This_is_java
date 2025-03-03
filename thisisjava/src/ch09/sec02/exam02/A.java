package ch09.sec02.exam02;

public class A {
	// field
	// constrator
	// method
	// Nested Class
	
	// 인스턴스 멤버 클래스 B 선언
	class B {
		// 필드 선언 및 초기화
		int field1 = 1;
		
		// 정적 필드
		static int filed2 = 2;
		
		//생성자
		B(){
			System.out.println("B-생성자 실행");
		}
		
		// 메소드
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		// 정적 메소드 자바 17부터 가능
		public static void method2() {
			System.out.println("B-static-method 실행");
		}
	}
	
	// 클래스 A의 인스턴스 메소드
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		// B클래스의 정적 필드 호출
		System.out.println(B.filed2); // 클래스명.필드명;
		
		// B클래스의 정적 메소드 호출
		B.method2(); // 클래스명.매소드명;
	}	
	// A 클래스의 useB 메소드 호출 시 실행됨
	
}
