package ch05.sec06.arrayGpt;

public class Arraysum {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40};
		
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		System.out.println("총합 : "+sum);
	}
}

