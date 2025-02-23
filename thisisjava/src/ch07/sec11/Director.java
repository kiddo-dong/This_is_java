package ch07.sec11;

// non-sealed 된 Manager 클래스를 상속 받음
public class Director extends Manager{
	@Override
	public void work() {
		System.out.println("제품 기획");
	}
}
