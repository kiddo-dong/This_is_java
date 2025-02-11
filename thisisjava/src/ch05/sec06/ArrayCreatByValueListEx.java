package ch05.sec06;

public class ArrayCreatByValueListEx {
	public static void main(String[] args) {
		// 배열 선언 후 초기화
		// 타입[] 변수명;
		// 변수명 = new 타입[] {value};
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("총 합 : "+ sum);
		
		// 메소드 호출
		printItem(scores); // scores 배열 인자
	}
	
	// printItem 메소드
	public static void printItem(int[] scores) {
		for(int i=0;i<3;i++){
			System.out.println(scores[i]);
		}
	}	
}