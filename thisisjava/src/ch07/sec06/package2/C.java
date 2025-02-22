package ch07.sec06.package2;

// 참조할 패키지의 경로
import ch07.sec06.package1.A;

public class C{
	//protected 속성으로 다른패키지에서 상속받지 않았으므로 접근이 불가함
	/*
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
	*/
}
