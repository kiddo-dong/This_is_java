package ch14.quiz.exam05;

import ch14.sec05.SleepExample;

public class Main {
	public static void main(String[] args) {
		Thread AutoSaveThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						System.out.println("Auto Save...");
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("Auto Save down");
					}
				}
			}
		});
		
		// Daemon thread setting
		AutoSaveThread.setDaemon(true);
		AutoSaveThread.start();
		
		
		for(int i=0; i<5; i++) {
			try {
				System.out.println("Tasking...");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("End Task");
		
	}
}
