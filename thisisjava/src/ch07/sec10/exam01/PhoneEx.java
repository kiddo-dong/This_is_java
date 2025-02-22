package ch07.sec10.exam01;

public class PhoneEx {
	public static void main(String[] args) {
		// Phone p = new Phone();
		// Phone 클래스는 abstract 클래스로 객체 생성 불가능
	
		SmartPhone choi = new SmartPhone("최동현");
		
		System.out.println("오우너 : " + choi.owner);
		
		choi.On();
		choi.search();
		choi.Off();
		
		System.out.println();
		
		PhonePhone lee = new PhonePhone("이주은");
		
		System.out.println("오우너 : " + lee.owner);
		lee.On();
		lee.yee();
		lee.Off();
	}
}
