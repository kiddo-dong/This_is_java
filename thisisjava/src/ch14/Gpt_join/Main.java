package ch14.Gpt_join;

class SlowThread extends Thread {
    public void run() {
        try {
            Thread.sleep(5000); // 5초 후 종료
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("SlowThread 종료");
    }
}

public class Main {
    public static void main(String[] args) {
        SlowThread t1 = new SlowThread();
        t1.start();

        try {
			t1.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("메인 스레드 종료");
    }
}

