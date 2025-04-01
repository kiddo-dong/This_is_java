package ch14.sec08.gptDaemon;

import java.time.LocalTime;

public class AutoSaveThread extends Thread {
    // 자동 저장 기능
    public void save() {
        System.out.println("[" + LocalTime.now() + "] 자동 저장되었습니다.");
    }

    @Override
    public void run() {
        try {
            while (true) {
                save();
                Thread.sleep(5000); // 5초 대기
            }
        } catch (InterruptedException e) {
            System.out.println("(자동 저장 스레드 자동 종료)");
        } finally {
            System.out.println("finally 블록 실행됨 (데몬 스레드가 종료될 때 실행되는지 확인)");
        }
    }
}
