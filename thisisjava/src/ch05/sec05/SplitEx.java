package ch05.sec05;

public class SplitEx {
	public static void main(String[] args) {
		String[] board = "1,자바 합습,참조타입 String을 학습.,최동현".split(",");
		
		for(int i = 0; i<board.length; i++) {
			System.out.println(board[i]);
		}
		
	}
}
