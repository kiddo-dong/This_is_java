package ch07.sec10.exam02;

public class human extends Ani{
	
	public String owner;
	
	public human(String owner) {
		this.owner = owner;
	}
	
	public void sound() {
		System.out.println("아파잉");
	}
}
