package ch14.quiz.exam01;

public class User2 extends Thread{
	private Theater theater;
	
	public User2(Theater theater) {
		  this.theater = theater;
	}
	
	
	@Override
	public void run() {
		System.out.println("User2에서 예매");
		
		theater.reserveSeat("B 유저");
	}
}
