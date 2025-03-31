package ch14.Gpt_synchronized;
class SharedData {
    private int value;
    private boolean isProduced = false;  // 생산된 데이터가 있는지 확인하는 플래그

    // 생산자 메소드 (비어 있는 부분을 채우세요)
    public synchronized void produce(int value) throws InterruptedException {
        // 생산된 데이터가 있을 경우 대기
        while (isProduced) {
            wait();
        }

        // 데이터 생산 (생산하는 부분)
        // TODO: 데이터를 생산하고 알림을 보내세요.
        
    }

    // 소비자 메소드 (비어 있는 부분을 채우세요)
    public synchronized void consume() throws InterruptedException {
        // 데이터가 생산되지 않았으면 대기
        while (!isProduced) {
            wait();
        }

        // 데이터 소비 (소비하는 부분)
        // TODO: 데이터를 소비하고 알림을 보내세요.
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedData sharedData = new SharedData();

        // 생산자 스레드
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedData.produce(i);  // 생산자 스레드가 데이터를 생산합니다.
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 소비자 스레드
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedData.consume();  // 소비자 스레드가 데이터를 소비합니다.
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 스레드 실행
        producer.start();
        consumer.start();

        // 두 스레드가 끝날 때까지 기다린다
        producer.join();
        consumer.join();
    }
}
