package gpt.TreeSet.exam02;

import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner us_in = new Scanner(System.in);
	TreeSet<Integer> numSet = new TreeSet<>();
	
	System.out.print("입력 받을 개수 : ");
	int num = us_in.nextInt();
	System.out.println();
	
	System.out.print("입력 : ");
	for(int i = 0; i<num; i++) {
		int n = us_in.nextInt();
		numSet.add(n);
	}
	
	for(Integer n : numSet) {
		System.out.print(n + " ");
	}
	}
}
