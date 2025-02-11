package ch05.sec06;

public class ArrayCreatByValueEx {
	public static void main(String[] args) {
		// 배열 선언 및 초기화
		// 타입[] 변수명 = {value....};
		
		
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		for(int i = 0; i <season.length; i++) {
			System.out.println("season["+i+"] : "+season[i]);
		}
		System.out.println();
		
		season[1] = "여름";
		for(int i = 0; i <season.length; i++) {
			System.out.println("season["+i+"] : "+season[i]);
		}
		System.out.println("===========================================");
		
		int[] scores = {83,90,87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		
		System.out.println("평균 : " + (double)sum/scores.length);
	}
}
