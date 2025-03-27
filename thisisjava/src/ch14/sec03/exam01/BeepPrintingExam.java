package ch14.sec03.exam01;

import java.awt.Toolkit;

import javax.print.attribute.standard.PrinterURI;

public class BeepPrintingExam {
	public static void main(String[] args){
		
		// task1
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		for(int i=1; i<=5; i++){
			tk.beep();
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				
			}
		}
		
		// task2
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
