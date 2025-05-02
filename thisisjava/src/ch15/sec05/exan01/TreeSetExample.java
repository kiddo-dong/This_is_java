package ch15.sec05.exan01;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		
		// TreeSet init
		TreeSet<Integer> scores = new TreeSet<>();
		
		// TreeSet get value
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// print for TreeSet object
		for(Integer score : scores) {
			System.out.print(score + " | ");
		}
		System.out.println();
		
		// TreeSet Method
		System.out.println(scores.first()); // TreeSet lowest rank Object
		System.out.println(scores.last()); // TreeSet highest rank Object
		System.out.println(scores.lower(95));
		System.out.println(scores.higher(95));
		System.out.println(scores.floor(95));
		System.out.println(scores.ceiling(85)); // TreeSet not in 85
		System.out.println();
		
		// print decending scores Set
		NavigableSet<Integer> decendingScore = scores.descendingSet();
		System.out.println(decendingScore);
		for(Integer score : decendingScore) {
			System.out.println(score);
		}
		System.out.println();
		
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for(Integer range : rangeSet) {
			System.out.println(range);
		}
		System.out.println();
		
		rangeSet = scores.subSet(80, true, 90, false);
		for(Integer range : rangeSet) {
			System.out.println(range);
		}
	}	
}
