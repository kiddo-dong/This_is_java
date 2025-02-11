package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 3;
		
		// 필드 default 및 private 접근제한으로 사용불가
		// a.field2 = 3;
		// a.field3 = 3;
	
		a.method1();
		
		// 메소드 default 및 private 접근제한으로 사용불간ㄴㄴㄴ
		//a.method2();
		//a.method3();
	}
}
