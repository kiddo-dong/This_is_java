package gpt.Lambda.exam02;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요");
		System.out.print("x: ");
		int x = us_in.nextInt();
		System.out.print("b : ");
		int y = us_in.nextInt();
		
		MaxFinder MaxFindFunction = (a,b) -> {
			if(a<b) {
				return b;
			} else if(a>b) {
				return a;
			}
			return a;
		};
		
		System.out.println(MaxFindFunction.find(x, y));
	}
}
