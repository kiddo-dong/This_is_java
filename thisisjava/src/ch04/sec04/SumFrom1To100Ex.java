package ch04.sec04;

public class SumFrom1To100Ex {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1;i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "까지의 합 : " + sum);
	}
}