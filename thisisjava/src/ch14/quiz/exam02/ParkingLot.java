package ch14.quiz.exam02;

public class ParkingLot {
    private final int max_parkinglot = 3;
    private int now_parkinglot = 0;

    public synchronized void parking(String car) {
        while (now_parkinglot >= max_parkinglot) {  // 🚨 if → while 변경 (깨워진 후에도 조건 다시 확인)
            try {
                System.out.println(car + " : 🚧 남은 주차 공간이 없어 대기 중...");
                wait();  // 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 🚗 주차 성공
        now_parkinglot++;
        System.out.println(car + " : ✅ 주차 성공! (남은 자리: " + (max_parkinglot - now_parkinglot) + ")");

        try {
            Thread.sleep(1000); // 🚙 2초 후 출차
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 🚙 출차 완료
        now_parkinglot--;
        System.out.println(car + " : 🔄 출차 완료! (남은 자리: " + (max_parkinglot - now_parkinglot) + ")");

        notify(); // 🚨 대기 중인 차량 깨우기
    }
}
