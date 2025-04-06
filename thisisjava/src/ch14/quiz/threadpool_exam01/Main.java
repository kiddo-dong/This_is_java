package ch14.quiz.threadpool_exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ch14.sec03.exam03.task1;

public class Main {
	public static void main(String[] args) {
		// thread pool 
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		for(int i=1; i<6; i++) {
			final int idx = i;
			threadPool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("작업 "+ idx +" 시작");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
					}
					System.out.println("작업 "+ idx + " 완료");
				}
			});
		}
		
		// end threadPool
		threadPool.shutdown();
	}
}	
