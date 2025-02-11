package ch06.sec08.myValeueLength;

public class Score {
	int[] odd(int ... value) {
		
		int[] array = new int[value.length/2];
		
		int idx = 0;
		for(int i=0; i<value.length; i++) {
			if(0==i%2) {
				array[idx] = value[i];
				idx++;
			}
		}
		
		return array;
	}
}
