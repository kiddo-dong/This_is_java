package ch14.quiz.exam07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		ExecutorService threadPoool = new ThreadPoolExecutor(
				0,
				5,
				60,
				TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>()
				);
		System.out.println(threadPoool);

	}
}
