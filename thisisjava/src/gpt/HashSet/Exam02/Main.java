package gpt.HashSet.Exam02;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

		set1.retainAll(set2);
		for(Integer obj : set1) {
			System.out.println(obj);
		}	
	}
}
