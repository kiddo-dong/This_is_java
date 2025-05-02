package ch15.sec02.exam04.exam01;

import java.util.*;
import java.util.Map.Entry;

import lombok.Value;

public class HashMapExample {
	public static void main(String[] args) {
		// Key : Value
		Map<String, Integer> map1 = new HashMap();
		
		// Object init
		map1.put("신용권", 85);
		map1.put("홍길동", 90);
		map1.put("동장군", 80);
		map1.put("홍길동", 95);
	
		// map1 size
		System.out.println("총 Entry 수: " + map1.size());
		System.out.println();
		
		// get value from key
		String hong = "홍길동";
		int value = map1.get(hong);
		System.out.println(hong + " : " + value);
		System.out.println();
		
		// get keySet collection from map1
		Set<String> keySet = map1.keySet(); // get Key Set
		Iterator<String> iter = keySet.iterator(); // get key one by one from map1 
		while(iter.hasNext()) {
			String k = iter.next();
			Integer v = map1.get(k);
			System.out.println(k + " : " +  v);
		}
		System.out.println();
		
		// HashMap Object
		for(Entry<String, Integer> obj : map1.entrySet()) {
			String k = obj.getKey();
			int v = obj.getValue();
			
			System.out.println(k + " : " + v);
		}
		
		map1.remove("홍길동");
		System.out.println(map1.size());
		
			
	}
}