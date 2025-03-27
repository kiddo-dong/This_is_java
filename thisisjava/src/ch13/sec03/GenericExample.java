package ch13.sec03;

public class GenericExample {
	
	public <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	} 
	
	public static void main(String[] args) {
		GenericExample a = new GenericExample();
		Box<Integer> box1 = a.boxing(100); // static
		int intvalue = box1.get();
		System.out.println(intvalue);
		
		
		GenericExample b = new GenericExample();
		Box<String> box2 = b.boxing("홍길동");
		String name = box2.get();
		System.out.println(name);
	}
}
