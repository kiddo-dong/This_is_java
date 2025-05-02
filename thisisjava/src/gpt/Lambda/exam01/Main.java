package gpt.Lambda.exam01;

public class Main {
	public static void main(String[] args) {
		Printer function = (msg) -> {System.out.println(msg);};
		
		function.print("람다식 연습");;
	}
}
