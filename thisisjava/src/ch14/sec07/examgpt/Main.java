package ch14.sec07.examgpt;

public class Main {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			
		}  // 인터럽트 발생
		thread.interrupt();
	}
}
