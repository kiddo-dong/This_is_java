package ch14.quiz.exam01;

public class User1 extends Thread{
	private Theater theater;
	
	public User1(Theater theater) {
		  this.theater = theater;
	}
	
	@Override
	public void run() {
		System.out.println("User1에서 예매");
		
		for(int i=1; i<11; i++) {
			theater.reserveSeat("A 유저");
		}
	}
}
