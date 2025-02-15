package ch07.sec03.exam01;

public class SmartPhoneEx {
	public static void main(String[] args) {
		// 자식 클래스에서 객체 생성 및 초기화
		SmartPhone myphone = new SmartPhone("갤럭시", "은색");
		
		// 상속 받은 필드 출력
		System.out.println(myphone.model);
		System.out.println(myphone.color);
	}
}
