package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		Integer obj2 = new Integer(100);
		
		System.out.println(obj);
		
		//UnBoxing
		int a = obj;
		System.out.println(a);
	}
}
