package ch07.sec02;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("iphone", "space gray");
		// 상속 받은 필드 읽기
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
		
		System.out.println(myPhone.wifi);
		myPhone.setwifi(true);
		
	}
}