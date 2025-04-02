package ch14.sec09.exam01;

import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // 코어 스레드 5개, 최대 스레드 10개, 60초 유휴 시간, 작업 큐 크기 5
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5, 10, 60L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                new ThreadPoolExecutor.AbortPolicy()
        );

        // 11개의 작업 제출
        for (int i = 1; i <= 11; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is being processed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // 작업 실행 시간
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " is completed by " + Thread.currentThread().getName());
            });
        }
        
        executor.shutdown();
    }
}
