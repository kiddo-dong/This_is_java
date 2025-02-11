package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;
import ch03.sec01.*;

public class C {
	A a1 = new A(true);
	// A a2 = new A(1);
	// default 접근제한으로 타 패키지에서 접근 불가
	// A a3 = new A("문자열");
	// private 접근제한으로 타 패키지 및 타 클래스에서 접근 불가
	SignOperatorEx a2 = new SignOperatorEx();
}
