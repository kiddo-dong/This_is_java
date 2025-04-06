package ch15.sec02.exam01.gpt01;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Set<Integer> list = new LinkedHashSet<>();
		
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(5);
		
		System.out.println(list);
		
	}
}