package ch09.sec07.exam03;

public class Button {
	
	// 정적 멤버 인터페이스
	public static interface ClickListener {
		// 추상 메소드 (overriding 필요)
		void onClick();
	}
	
	// 인터페이스 필드선언
	// 즉 구현객체 대입 필드
	private ClickListener clicklistener;
	
	// setter 메소드
	// 구현객체 매개변수
	public void setClickLisnter(ClickListener clicklistener) {
		this.clicklistener = clicklistener;
	}
	
	public void click() {
		// 구현객체의 overriding 된 onClick 메소드
		this.clicklistener.onClick();
	}
	
	
	
}
