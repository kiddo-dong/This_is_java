package ch14.quiz.exam01;

public class Theater {
	private int seat = 10;
	
	public synchronized void reserveSeat(String user){
		if(seat>0) {
			System.out.println(user+"예매 성공");
			seat = seat - 1;
			System.out.println("자리가 " + seat + "개 남았습니다.");
		} else {
			System.out.println(user+"예매 실패");
			System.out.println("예매 실패 남은 좌석이 없습니다.");
		}
	}
	
}
