package ch06.sec08.myValue;

import java.util.Scanner;

public class AVGEX {
	public static void main(String[] args) {
		Scanner us_in = new Scanner(System.in);
		
		System.out.print("배열의 갯수 입력 : ");
		int num = us_in.nextInt();
		
		int[] array = new int[num];
		
		System.out.println("원소에 값을 입력");
		for(int i=0;i<array.length;i++) {
			System.out.print("array["+i+"] : ");
			array[i] = us_in.nextInt();
		}
		
		AVG arr_values = new AVG();
		
		double avg = arr_values.average(array);
		
	}
}
