package ch06.sec15;

public class Singleton {
	// 싱글톤 패턴
	// 앱 전체에서 단 한개의 객체만 생성해서 사용
	// private 클래스() {}
	private static Singleton singleton = new Singleton();

	private Singleton() {
	
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}