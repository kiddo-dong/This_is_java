package ch14.Gpt_daemonThread;

public class UserThread extends Thread{
	Thread daemonThread = new Thread(new Runnable() {
		@Override
		public void run() {
				while(true) {
				try {
					System.out.println("데몬 스레드 실행 중...");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("(데몬 스레드 종료)");
				}
			}
		}
	});
	
	@Override
	public void run() {
		daemonThread.setDaemon(true);
		daemonThread.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("사용자 스레드 실행중...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("(사용자 스레드 종료)");
	}
}
