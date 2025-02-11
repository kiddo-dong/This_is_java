package ch05.sec06.arrayGpt;

public class Arrayminmax {
	public static void main(String[] args) {
		int[] numbers = {15, 8, 22, 5, 31, 12};
		
		int min = numbers[0];
		int max = numbers[0];
		for(int num : numbers) {
			if(min > num) {
				min = num;
			}
			if(max < num) {
				max = num;
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : "+ min);
	}
}
