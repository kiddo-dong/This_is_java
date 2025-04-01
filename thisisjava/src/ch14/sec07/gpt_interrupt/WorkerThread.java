package ch14.sec07.gpt_interrupt;
public class WorkerThread extends Thread {
    @Override
    public void run() {
        while (!Thread.interrupted()) {  // isInterrupted()로 상태 확인
            try {
            	System.out.println("작업 수행 중...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("❗ 인터럽트 감지! 스레드 종료.");
                break;  // 안전하게 종료
            }
        }
        System.out.println("🛑 스레드가 인터럽트되어 종료됩니다.");
    }
}
