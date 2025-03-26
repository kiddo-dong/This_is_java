package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		// 제네릭 String 선언 (변수명 con)
		Box<String> b = new Box<>();
		b.con = "choi"; // boxing
		System.out.println(b.con); // 제네릭 필드 호출 및 출력
		String unb = b.con; // unboxing
		System.out.println(unb);
		
		Box<Integer> bi = new Box<>();
		bi.con = 1000;
		int biunb = bi.con;
		System.out.println(biunb);
	}
}
