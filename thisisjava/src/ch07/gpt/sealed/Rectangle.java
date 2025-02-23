package ch07.gpt.sealed;

public final class Rectangle extends Shape{
	public double row;
	public double column;
	
	public Rectangle(double row, double column ){
		this.row = row;
		this.column = column;
	}
	
	@Override
	public double area() {
		return row * column;
	}
}
