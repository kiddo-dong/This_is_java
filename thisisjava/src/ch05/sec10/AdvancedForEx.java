package ch05.sec10;

public class AdvancedForEx {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		double avg = 0.0;
		// 점수 총합 및 평균
		
		for(int score : scores) {
			sum+=score;
		}
		avg = (double)sum/scores.length;
		
		System.out.println("총 합 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
