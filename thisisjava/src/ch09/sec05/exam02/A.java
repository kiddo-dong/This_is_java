package ch09.sec05.exam02;

public class A {
	// A의 필드
	String field = "A-field";
	// A의 메소드
	void method() {
		System.out.println("A-method");
	}
	
	// 인스턴스 멤버 클래스 (중첩 클래스)
	class B {
		// B의 필드
		String field = "B-field";
		// B의 메소드
		void method() {
			System.out.println("B-method");
		}
	
		void print() {
			System.out.println(this.field); // B를 참조 - this 는 자기 자신
			this.method(); // B를 참조 
			
			System.out.println(A.this.field);
			A.this.method();
		} // print 메소드 끝
	} // class B
	
	// A의 메소드
	void useB() {
			B b = new B(); // B클래스 타입 객체 b 생성 및 호출 
			b.print(); // 객체 b의 메소드 호출
		}
}
