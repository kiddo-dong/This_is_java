package ch17.sec01.exam01;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("김자바");
		
		// 외부 반복자 - 외부에서 객체 하나씩 처리
		for(String item : set) {
			System.out.println(item);
		}
		
		System.out.println(); 
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { 
			String item = iterator.next();
			System.out.println(item);
		}
		
		System.out.println();
		
		// 내부 반복자 - 내부에서  객체를 한번에 처리
		Stream<String> stream = set.stream();
		stream.forEach((i)->{
			System.out.println(i);
		});
		
		System.out.println();
		
		stream = set.stream();
		stream.forEach((i)->System.out.println(i));

		
	}
}
