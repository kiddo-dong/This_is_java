package ch12.sec03.exam04;

import java.util.HashSet;

import ch12.sec03.exam02.hashSetExample;

public class RecordExample {
	public static void main(String[] args) {
		Member m = new Member("winter", "눈송이", 25);
		
		HashSet hs = new HashSet();
		
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m.toString());
	
		System.out.println();
		
		Member m1 = new Member("winter", "눈송이", 25);
		Member m2 = new Member("winter", "눈송이", 25);
		
		hs.add(m1);
		hs.add(m2);
		
		System.out.println("hashCode : " + m1.hashCode());
		System.out.println("hashCode : " + m2.hashCode());
		System.out.println("객체 동등 비교 :" + m1.equals(m2));
		
		System.out.println("HashSet의 객체 데이터 갯수 : " + hs.size());
		
	}
}
