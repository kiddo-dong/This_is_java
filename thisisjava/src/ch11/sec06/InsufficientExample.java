package ch11.sec06;

// 사용자 정의 예외
// Exception을 상속받아 사용자 정의 예외 클래스를 선언
public class InsufficientExample extends Exception{
	// 생성자
	public InsufficientExample() {
	}
	
	public InsufficientExample(String message) {
		super(message); // Exception 클래스로 message매개변수 넘겨줌 
	}
}