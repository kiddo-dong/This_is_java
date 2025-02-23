package ch07.gpt.sealed;

public abstract sealed class Shape permits Circle, Rectangle{
	// 추상 메소드
	public abstract double area();
}
