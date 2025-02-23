package ch07.gpt.sealed;

public final class Circle extends Shape{
	public double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	public double area() {
		return r * r * Math.PI;
	}
	
}
