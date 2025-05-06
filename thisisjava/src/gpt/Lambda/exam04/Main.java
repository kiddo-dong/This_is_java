package gpt.Lambda.exam04;

public class Main {
	public static void main(String[] args) {
		Square function = (x) -> x*x;
		System.out.println(function.calculate(5));
	}
}
