package ch13.sec03;

public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	public <T> void boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		System.out.println(box.get());
	} 
	
	public static <T> void boxing2(T t){
		Box<T> box = new Box<>();
		box.set(t);
		System.out.println(box.get());
	} 
}
