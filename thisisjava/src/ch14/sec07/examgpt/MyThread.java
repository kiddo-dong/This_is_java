package ch14.sec07.examgpt;

public class MyThread extends Thread{
	@Override
	public void run() {
		int count=1;
		
		while(true) {	
			try {
				System.out.println(count++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드 종료됨");
				break;
			}
		}
	}
}
