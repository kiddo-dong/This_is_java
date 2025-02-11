package ch05.sec07;

public class MultiDimensionalArrayEx {
	public static void main(String[] args) {
		// 2차원 배열선언
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		System.out.println("1차원 배열 길이(반의 수) : " + scores.length);
		
		System.out.println("2차원 배열의 길이(첫번째 반 학생 수) : "+ scores[0].length);
		System.out.println("2차원 배열의 길이(첫번째 반 학생 수) : "+ scores[1].length);
		
		System.out.println("첫번째 반의 세번쨰 학생의 점수 : " + scores[0][2]);
		System.out.println("두번째 반의 두번째 학생의 점수 : " + scores[1][1]);
		
		int avg_fir = 0;
		for(int score : scores[0]) {
			avg_fir += score; 
		}
		System.out.println("첫번째 반의 평균 점수 : " + (double)avg_fir/scores[0].length);
	
		int avg_sec = 0;
		for(int score : scores[1]) {
			avg_sec += score;
		}
		System.out.println("두번째 반의 평균 점수 : " + (double)avg_sec/scores[1].length);
		
		int all_avg = 0;
		for(int[] score : scores) { 
			for(int score_st : score) {
				all_avg += score_st;
			}
		}
		System.out.println("전체 학생의 평균 점수 : " + (double)all_avg/(scores[0].length + scores[1].length));
	}
}
