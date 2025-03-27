package ch14.sec03.exam04;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		// 작업 1
		Thread task1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit t = Toolkit.getDefaultToolkit();
				
				for(int i=1; i<=5; i++) {
					t.beep();
					try {
						Thread.sleep(1000);
						} catch (InterruptedException e) {
					}
				}
			}
		});
		task1.start();
		
		// 작업 2
		Runnable run_imple = new Task2();
		Thread task2 = new Thread(run_imple);
		task2.start();
		
		
	}
}
