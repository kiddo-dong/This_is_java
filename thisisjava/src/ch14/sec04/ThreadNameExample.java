package ch14.sec04;

public class ThreadNameExample {
	// main thread
	public static void main(String[] args) {
		Thread mainthread = Thread.currentThread(); 
		System.out.println("main thread name : " + mainthread.getName());
		System.out.println();
	
		Thread thread01 = new Thread(new Runnable () {
			@Override
			public void run() {
				System.out.println("thread01 실행");
				Thread threadname_01 = Thread.currentThread();
				System.out.println("new thread name : " + threadname_01.getName());
				
				threadname_01.setName("새 스레드");
				System.out.println("new thread name : "+threadname_01.getName());
				System.out.println();
		
			}
		});
		thread01.start();
	}
}
