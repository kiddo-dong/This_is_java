package gpt.Lambda.exam05;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input : ");
		String us_in = scanner.next();
		
		StringLengthChecker lengthFunction = (s) -> s.length();
		System.out.println(lengthFunction.getLength(us_in));
	}
}
