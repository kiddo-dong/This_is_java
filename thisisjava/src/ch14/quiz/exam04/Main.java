package ch14.quiz.exam04;

public class Main {
	public static void main(String[] args) {
		// object
		Monitor_Object object = new Monitor_Object();
		
		// multi_thread
		Thread ping_thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					object.method1(true);
				}
			}
		});

		Thread pong_thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					object.method1(false);
				}
			}
		});
		
		ping_thread.start();
		pong_thread.start();
		
	}
}
