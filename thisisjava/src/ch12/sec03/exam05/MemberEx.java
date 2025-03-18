package ch12.sec03.exam05;

import java.util.HashSet;

public class MemberEx {
	public static void main(String[] args) {
		Member m = new Member("fall", "단풍이");
		Member m1 = new Member("fall", "단풍이");
		Member m2 = new Member("fall", "단풍이");
		
		HashSet h = new HashSet();
		
		System.out.println(m1);
		System.out.println(m2);

		h.add(m1);
		h.add(m2);

		System.out.println("HashSet 객체 갯수 : " + h.size());
		
		
		if(m1.hashCode() == m2.hashCode()) {
			if(m1.equals(m2)) {
				System.out.println("두 객체는 동등 객체");
			} else {
				System.out.println("내부의 데이터가 다름");
			}
		} else {
			System.out.println("해시 코드가 같지 않음");
		}
	}
}
