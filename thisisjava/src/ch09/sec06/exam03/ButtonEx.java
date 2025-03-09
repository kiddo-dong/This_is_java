package ch09.sec06.exam03;

public class ButtonEx {
	public static void main(String[] args) {
		// 객체 생성 (Button 클래스 객체)
		Button Ok = new Button();
		Button Cancel = new Button();
		
		// 구현 객체 생성 (중첩 클래스)
		class OkListener implements Button.ClickListener{
			// ClickListener 인터페이스의 메소드 오버라이딩
			@Override
			public void onClick() {
				System.out.println("Ok Button");
			}
		}
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel Button");
			}
		}
		
		//Button 객체에 구현 객체 대입
		// 구현객체 OkListener 클래스
		Ok.setClickLisnter(new OkListener());
		// 구현객체 CalcelListener 클래스
		Cancel.setClickLisnter(new CancelListener());
	
		// 객체의 메소드 호출
		// 내부동작 : 인터페이스 필드(구현객체).onClick();
		Ok.click();
		Cancel.click();
	
	}	
}
