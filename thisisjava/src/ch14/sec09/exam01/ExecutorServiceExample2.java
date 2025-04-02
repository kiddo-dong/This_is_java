package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample2 {
	public static void main(String[] args) {
		ExecutorService threadpool = Executors.newFixedThreadPool(10);
		threadpool.shutdown();
		// threadpool.shutdownNow();
	}
}
