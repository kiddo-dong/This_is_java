package ch05.sec09;

public class ArrayCopyEx {
	public static void main(String[] args) {
		String[] oldstrArray = {"java","Array","copy"};
		
		String[] newstrArray = new String[5];
		
		System.arraycopy(oldstrArray, 0, newstrArray, 0, oldstrArray.length);
		
		for(String i: newstrArray) {
			System.out.println(i);
		}
	}
}
