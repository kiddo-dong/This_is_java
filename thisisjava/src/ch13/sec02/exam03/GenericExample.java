package ch13.sec02.exam03;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> b1 = new Box<>();
		Box<String> b2 = new Box<>();
		b1.con = "100";
		b2.con = "100";
		
		System.out.println("동등 비교 : "+ b1.compare(b2));
	}
}
