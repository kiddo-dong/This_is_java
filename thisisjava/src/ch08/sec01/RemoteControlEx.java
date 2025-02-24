package ch08.sec01;

public class RemoteControlEx {
	public static void main(String[] args) {
		// 인터페이스 변수 rc 선언
		RemoteControl rc;
		rc = null;
		// RemoteControl rc = null;
		// 참조 변수 이므로 null 사용가능 
		
		// 인터페이스를 통해 Television 객체를 사용한다.
		rc = new Television();
		
		// 인터페이스 rc를 통해 구현 객체를 사용
		// RemoteControl rc = new Television();
		
		// rc에는 Television() 주소를 참조중
		rc.turnOn();
		
		// 구현 객체를 Television에서 Audio로 교체
		rc = new Audio();
		// 인터페이스를 통해 객체를 사용하겠다 선언
		
		rc.turnOn();
		
	}
}
