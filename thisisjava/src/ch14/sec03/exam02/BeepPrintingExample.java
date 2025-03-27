package ch14.sec03.exam02;

import java.awt.Toolkit;
import java.util.Iterator;

public class BeepPrintingExample {
	public static void main(String[] args) {
		
		// 새 스레드
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					Toolkit tk = Toolkit.getDefaultToolkit();
					tk.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					
					}
				}
			}
		});
		
		thread.start();
		
		// 메인 스레드 작업
		for(int i=1;i<=5;i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
