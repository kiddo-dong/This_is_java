package ch09.sec02.exam01;

public class A {
	int field;
	A(){
		// 생성자 안에서 A클래스의 멤버 클래스인 B클래스를 사용 할 수 있다.
		B b = new B();
		b.methodB();
	}
	
	void methodA() {
		B b = new B();
		b.methodB();
	}
	
	
	public class B{
		//field
		//constructor
		//method
		public void methodB() {
			System.out.println("methodB 실행");
		}
	}
}
