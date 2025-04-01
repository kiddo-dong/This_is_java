package ch14.sec08.gptDaemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner us_in = new Scanner(System.in);

        // 자동 저장 스레드 생성
        AutoSaveThread saveThread = new AutoSaveThread();
        saveThread.setDaemon(true); // 데몬 스레드 설정
        saveThread.start();

        // 사용자 입력 대기
        System.out.println("문서를 편집 중입니다... (종료하려면 'exit' 입력)");

        String input = us_in.nextLine();

        if (input.equals("exit")) {
            System.out.println("프로그램 종료");
        }

        us_in.close(); // Scanner 닫기
    }
}
