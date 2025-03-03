package ch08.sec13;

// 구현 클래스
// A를 상속받은 B를 상속받은 C의 인터페이스로 구현 클래스 생성
public class ImpClass implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("A 실행");
	}

	@Override
	public void methodB() {
		System.out.println("B 실행");
	}

	@Override
	public void methodC() {
		System.out.println("C 실행");
	}
	
}
