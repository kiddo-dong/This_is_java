package ch14.sec09.exam01;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GptThreadPool {
	public static void main(String[] args) {
		ExecutorService threadpool = new ThreadPoolExecutor(
				3,
				6,
				45L,
				TimeUnit.SECONDS,
				new ArrayBlockingQueue<>(10)
				);
	threadpool.shutdown();
	}
}
