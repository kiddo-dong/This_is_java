package ch14.quiz.threadpool_exam02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {
	public static void main(String[] args) {
		// thread pool
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		// 3 task creat & execute
		for(int i=1; i<=3; i++) {
			final int idx = i;
			
			Future<String> future = threadPool.submit(new Callable<String>() {	
				@Override
				public String call() throws Exception {
					System.out.println("사용자 "+ idx + " 요청 시작");
					try {
						Thread.sleep((int)(Math.random() * 2000) + 1000);
					} catch (InterruptedException e) {
						
					}
					return "사용자" + idx + " 응답 완료";
				}
			});
			
			try {
				System.out.println(future.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		threadPool.shutdown();	
	}
}