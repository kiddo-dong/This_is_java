package ch05.sec07;

public class MultidimensionalArrayByNewEx {
	public static void main(String[] args) {
		// 다차원 배열 선언 및 초기화
		int[][] mathScores = new int[2][3];
		
		// 다차원 배열 모든 원소 초기값 출력
		for(int i=0;i<mathScores.length; i++) {
			for(int k=0;k<mathScores[i].length;k++){
				System.out.print("| "+mathScores[i][k]+" |");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
		//배열 idx[0]번
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		
		//배열 idx[1]번
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i<mathScores.length; i++) {
			// 전체 학생수 mathScores[0],mathScores[1] 의 길이 즉 전체 요소의 수
			totalStudent += mathScores[i].length;
			for(int j=0;j<mathScores[i].length; j++) {
				totalSum += mathScores[i][j];
			}			
		}
		double totalAvg = (double)totalSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 : " + totalAvg);
		
		System.out.println();
		
		// 이차원 배열의 요소 갯수가 다를경우 [2][2], [2],[3] 일때
		int[][] engScores = new int[2][];
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		
		// 초기화 된 모든 요소 출력
		for(int i=0;i<engScores.length;i++) {
			for(int j=0;j<engScores[i].length;j++) {
				System.out.print("| "+engScores[i][j]+" |");
			}
			System.out.println();
		}
		
		engScores[0][0] = 90;
		engScores[0][1] = 91;
		engScores[1][0] = 92;
		engScores[1][1] = 93;
		engScores[1][2] = 94;
		
		//전체 학생의 eng 평균값 구하기
		int engtotal = 0;
		int engsum = 0;
		
		for(int i=0; i<engScores.length;i++) {
			engtotal+=engScores[i].length;
			for(int j=0; j<engScores[i].length;j++){
				engsum += engScores[i][j]; 
			}
		}
		double engAvg = (double)engsum/engtotal;
		System.out.println("전체 학생의 영어 평균 : "+ engAvg);
		
	}
}
