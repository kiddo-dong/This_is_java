package ch14.sec05;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
			
		for(int i=0; i<5; i++) {
			tk.beep();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
