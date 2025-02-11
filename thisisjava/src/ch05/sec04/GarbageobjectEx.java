package ch05.sec04;

public class GarbageobjectEx {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // 참조 타입인 String 변수를 null로 변경
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null ; 
		System.out.println("kind2: " + kind2);
	}
}
