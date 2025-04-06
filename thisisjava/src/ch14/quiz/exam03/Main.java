package ch14.quiz.exam03;

public class Main {
	public static void main(String[] args) {
		// object
		BankAccount bank = new BankAccount();
		
		// Thread
		Thread thread1 = new Thread(new Runnable() {
			public void run() {	
				bank.withdraw(3000);
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				bank.withdraw(3000);
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				bank.withdraw(3000);
			}
		});
		
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				bank.withdraw(3000);
			}
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}
}