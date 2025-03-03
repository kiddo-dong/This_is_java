package ch08.sec10;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 인터페이스 변수 선언 
		A a;
		
		// 인터페이스 변수 객체 초기화
		a = b;
		a = c;
		a = d;
		a = e;
	}
}
