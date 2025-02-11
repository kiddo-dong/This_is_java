package ch06.sec08.myValue;

public class AVG {
	double average(int ... value) {
		
		int sum = 0;
		for(int i : value) {
			sum+=i;
		}
		
		double avg = (double)sum / value.length;

		return avg;
	}
}
