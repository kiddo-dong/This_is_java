package ch14.quiz.exam01;

public class Main {
	public static void main(String[] args) {
		Theater theater = new Theater();
		
		Thread threadA = new User1(theater);
		Thread threadB = new User2(theater);
		
		threadA.start();
		threadB.start();
	}
}
