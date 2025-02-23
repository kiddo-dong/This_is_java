package ch07.sec11;

// Manager 클래스를 상속 가능하게 non-sealed 처리
public non-sealed class Manager extends Person {
	@Override
	public void work() {
		System.out.println("생산 관리");
	}
}
