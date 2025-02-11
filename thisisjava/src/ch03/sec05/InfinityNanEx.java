package ch03.sec05;

public class InfinityNanEx {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		
		System.out.println(z);
		
		// exception
		// if value is infinity or nan return true, otherwise return false.
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			
		}
		
	}
}
