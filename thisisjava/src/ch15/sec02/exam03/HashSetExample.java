package ch15.sec02.exam03;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		// Hash set
		Set<String> set1 = new HashSet<String>();
		
		//set add
		set1.add("Java");
		set1.add("JDBC");
		set1.add("JSP");
		set1.add("Spring");
		
		// set 객체 하나씩 가져와 처리
		// Iterator<E>
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { // hasNext() - hashset 객체 boolean
			
			String element = iter.next();
			System.out.println(element);
			//element.remove();
			if(element.equals("JDBC")) {
				iter.remove();
			}
		}
		System.out.println();
		
		set1.remove("JDBC");
		
		for(String set :set1 ) {
			System.out.println(set);
		}
	}
}
