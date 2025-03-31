package ch14.Gpt_yield;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " 실행 중...");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("WorkerThread");
        
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("MainThread 실행 중...");
            Thread.yield();
        }
    }
}
