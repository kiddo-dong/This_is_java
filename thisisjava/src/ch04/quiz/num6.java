package ch04.quiz;

import java.util.Scanner;

public class num6 {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		
		System.out.print("최대 갯수 지정 : ");
		int num = us_in.nextInt();
		
		for (int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
