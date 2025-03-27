package ch14.sec03.exam03;

public class task1 extends Thread{
	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	};
}