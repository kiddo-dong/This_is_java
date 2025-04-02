package ch14.Gpt_daemonThread;

public class Main {
	public static void main(String[] args) {
		Thread thread = new UserThread();
		thread.start();
	}
}
