package gpt.Lambda.exam03;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Filter AllowCheck = (String s) -> {
			if(s.equals("Java")) {
				System.out.println(s + " is allowed");
			} else {
				System.out.println(s + " is not allowed");
			}
		};
		
		Scanner us_in = new Scanner(System.in);
		System.out.print("input : ");
		String input = us_in.next();
		
		AllowCheck.check(input);
	}
}
