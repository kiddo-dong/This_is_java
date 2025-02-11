package ch06.sec08.myValeueLength;

import java.util.Arrays;

public class ScoreEx {
	public static void main(String[] args) {
		int[] value = {1,2,3,4,5,6,7,8,9,10};
		
		Score sum_odd = new Score();
		
		int[] array = sum_odd.odd(value);
		System.out.println("배열의 짝수 인덱스 출력 : " + Arrays.toString(array));
	}
	
}
