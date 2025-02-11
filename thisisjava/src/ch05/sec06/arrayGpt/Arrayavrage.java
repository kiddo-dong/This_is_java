package ch05.sec06.arrayGpt;

public class Arrayavrage {
	public static void main(String[] args) {
		int[] numbers = {3, 7, 9, 15, 20};
		int sum=0;
		
		for(int num : numbers) {
			sum+=num;
		}
		System.out.println("평균 값 : "+ (float)sum/numbers.length);
	}
}
