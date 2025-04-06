package ch14.quiz.exam03;

public class BankAccount {
	private int balance = 10000;
	private int thread_count = 1;
	
	public synchronized void withdraw (int amount) {
		Thread thread = Thread.currentThread();
		thread.setName("Thread-"+thread_count++);
			
		if(balance > amount) {
			balance -= amount;
			System.out.println(thread.getName()+ " 출금 성공! 현재 잔액:" + balance);
		} else {
			System.out.println(thread.getName() + " 출금 실패");
		}
	} 
}
