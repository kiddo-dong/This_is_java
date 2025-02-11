package ch04.sec03;

import java.util.Scanner;

public class SwitchCharEx2 {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A', 'a':
				System.out.println("우수");
				break;
			case 'B', 'b':
				System.out.println("일반");
				break;
			default :
				System.out.println("손님");
		}
		
		switch(grade) {
		case 'A','a' -> System.out.println("우수");
		case 'B', 'b' -> System.out.println("일반");
		default -> System.out.println("손님");
		}
	}
}
