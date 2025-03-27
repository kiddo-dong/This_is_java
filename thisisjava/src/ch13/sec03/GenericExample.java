package ch13.sec03;

public class GenericExample {
	public static void main(String[] args) {
		// public 메소드 사용 시
		Box<Integer> num = new Box<>();
		num.boxing(100);
		
		Box<String> name = new Box<>();
		name.boxing("홍길동");
		
		System.out.println();
		// static 메소드
		Box.boxing2(100);
		Box.boxing2("최동현");
	}
}