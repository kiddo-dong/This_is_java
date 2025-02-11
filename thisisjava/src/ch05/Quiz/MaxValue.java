package ch05.Quiz;

public class MaxValue {
	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		
		int max = array[0];
		for(int num : array) {
			if(max<num) {
				max = num;
			}
		}
		System.out.println("max : " + max);
	}
}
