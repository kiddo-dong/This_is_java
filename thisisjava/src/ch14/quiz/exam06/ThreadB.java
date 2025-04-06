package ch14.quiz.exam06;

import javax.xml.stream.events.StartDocument;

import ch14.sec05.SleepExample;

public class ThreadB {
	public static void main(String[] args) {
		System.out.println("threadB tasking");
		Thread threadA = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("threadA tasking");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("threadA end task");
				
			}
		});
		threadA.start();
		
		try {
			threadA.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("threadB end task");
		
	}
}
