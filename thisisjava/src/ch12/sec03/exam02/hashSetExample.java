package ch12.sec03.exam02;

import java.util.HashSet;

public class hashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("갯수 : " + hashSet.size());
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("갯수 : " + hashSet.size());
		
		Student s3 = new Student(2," 최동현");
		hashSet.add(s3);
		System.out.println("갯수 : " + hashSet.size());
	}
}
