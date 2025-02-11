package ch04.sec06;

import java.util.Scanner;

public class DoWhileEx {
	public static void main(String args[]) {
		System.out.println("메시지를 입력 : ");
		System.out.println("(q) 프로그램 종료");
		
		Scanner us_in = new Scanner(System.in);
		String inputstring;
		
		do {
			System.out.print(">");
			inputstring = us_in.nextLine();
			System.out.println(inputstring);
		}while(!inputstring.equals("q"));

		System.out.println();
		System.out.println("프로그램 종료");
	}
}