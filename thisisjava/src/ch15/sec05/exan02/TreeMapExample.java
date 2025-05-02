package ch15.sec05.exan02;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, Integer> map1 = new TreeMap<>();
		
		map1.put("apple",10);
		map1.put("forever",60);
		map1.put("description",40);
		
		Set<Entry<String, Integer>> entryset = map1.entrySet();
		for(Entry<String, Integer> entry : entryset) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();
		
		Entry<String, Integer> entry = null;
		entry = map1.firstEntry();
		System.out.println(entry.getKey() + " : " + entry.getValue());
		entry = map1.lastEntry();
		System.out.println(entry.getKey() + " : " + entry.getValue());
	
		entry = map1.lowerEntry("forever");
		System.out.println(entry.getKey()+ " : " + entry.getValue());
		
	}
}
