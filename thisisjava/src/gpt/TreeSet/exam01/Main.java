package gpt.TreeSet.exam01;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		TreeSet<Integer> num = new TreeSet<>();
		
		num.add(87);
		num.add(75);
		num.add(98);
		num.add(75);
		num.add(95);
		num.add(80);
		num.add(98);
		num.add(75);
		
		for(Integer n : num) {
			System.out.print(n + " ");
		}
	}
}
