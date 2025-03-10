package ch09.sec07.exam03;

public class ButtonEx {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickLisnter(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("정적 인터페이스 매개변수 구현 객체 on");	
			}
		});
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		// 정적 인터페이스를 구현한 구현 객체
		btnCancel.setClickLisnter(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("정적 인터페이스 매개변수 구현객체 Cancel");
			}
		});
		
		btnCancel.click();
	}
}
