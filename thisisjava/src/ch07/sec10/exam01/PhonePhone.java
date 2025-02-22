package ch07.sec10.exam01;

public class PhonePhone extends Phone {
	public PhonePhone(String owner){
		super(owner);
	}
	
	void yee() {
		System.out.println(owner + "병신");
	}
}
