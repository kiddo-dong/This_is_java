package ch03.sec07;

import java.util.Scanner;

public class LogicalOperatorEx {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if(65<=charCode && charCode<=90) {
			System.out.println("대문자");
		}
		else if(97<=charCode && charCode<=122) {
			System.out.println("소문자");
			
		}
		else if (48<=charCode && charCode<=57) {
			System.out.println("0-9 숫자");
		}
		
		System.out.println("===========================");
		
		Scanner us_in = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int value = us_in.nextInt();
		
		if (value%2==0 || value%3==0) {
			System.out.println("2 또는 3의 배수");
		}
		else {
			System.out.println("2 또는 3의 배수가 아님");
		}
	}
}
