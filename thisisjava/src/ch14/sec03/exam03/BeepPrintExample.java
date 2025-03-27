package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Toolkit tool = Toolkit.getDefaultToolkit();
				
				for(int i=1;i<=5;i++) {
					tool.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		}; // 익명 자식 객체
		
		t1.start();
		
		Thread t2 = new Thread(new task1());
		t2.start();
	}
}
