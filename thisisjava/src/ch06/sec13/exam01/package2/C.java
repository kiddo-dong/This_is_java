package ch06.sec13.exam01.package2;

// 패키지 ch06.sec13.exam01.package1. 의 모든 패키지 참조
import ch06.sec13.exam01.package1.*;

public class C {
	//A a; // default 접근제한자
	B b; // B클래스는 public 접근재한자로 ch06.sec13.exam01.package1에 있는 클래스 이므로 public 제한으로 사용가능ㄴ
}
