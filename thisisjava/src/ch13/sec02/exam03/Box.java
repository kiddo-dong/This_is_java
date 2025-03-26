package ch13.sec02.exam03;

public class Box<T> {
	public T con;
	
	public boolean compare(Box<T> other) {
		boolean result = con.equals(other.con);
		return result;
	}
}
