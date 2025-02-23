package ch07.sec11;

// final 선언으로 타 클래스에서 상속 불가능
public final class Employee extends Person {
	@Override
	public void work() {
		System.out.println("제품 생산");
	}
}
