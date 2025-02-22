package ch07.sec10.exam01;

public abstract class Phone {
	String owner;
	
	public Phone(String owner){
		this.owner = owner;
	}
	
	void On() {
		System.out.println("Power On");
	}
	void Off() {
		System.out.println("Power Off");
	}
}
