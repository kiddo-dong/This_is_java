package gpt.Lambda.exam06;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		EvenChecker evenchecking = (num) -> {
			if(num%2==0) {
				return true;
			} else {
				return false;
			}
		};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input : ");
		int us_in = scanner.nextInt();
		System.out.println(evenchecking.isEven(us_in));
	}
}
