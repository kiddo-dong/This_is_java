package ch14.sec07.gpt_interrupt;

public class Main {
	public static void main(String[] args) {
		Thread thread = new WorkerThread();
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {	}
		
		thread.interrupt();
		
	}
}
