package ch06.quizGG.num20;

import java.util.Scanner;

public class BankSystem {
    String account_num;
    String name;
    int deposit;

    // 계좌 생성자
    public BankSystem(String account_num, String name, int deposit) {
        this.account_num = account_num;
        this.name = name;
        this.deposit = deposit;
        System.out.println("> 계좌가 생성됨");
    }

    // 입금 메소드
    public int money_deposit(int money_deposit) {
        deposit += money_deposit;
        return deposit;
    }

    // 출금 메소드
    public int money_withdrawl(int money_withdrawl) {
        deposit -= money_withdrawl;
        return deposit;
    }

    public static void main(String[] args) {
        Scanner us_in = new Scanner(System.in);

        boolean prg_exit = true;

        // 객체 배열 생성
        BankSystem[] Account = new BankSystem[100];
        int account_count = 0;

        while (prg_exit) {
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");

            System.out.print("선택> ");
            String option = us_in.nextLine();

            switch (option) {
                case "1": {
                    if (account_count < 100) {
                        System.out.println("----------");
                        System.out.println("계좌 생성");
                        System.out.println("----------");

                        System.out.print("계좌번호 : ");
                        String account_num = us_in.nextLine();
                        System.out.print("계좌주 : ");
                        String name = us_in.nextLine();
                        System.out.print("초기입금금액 : ");
                        int deposit = us_in.nextInt();
                        us_in.nextLine(); // ✅ 개행 문자 제거

                        // 객체 초기화
                        Account[account_count] = new BankSystem(account_num, name, deposit);
                        account_count++;
                    } else {
                        System.out.println("계좌 저장 데이터가 가득 참");
                    }
                    break;
                }

                case "2": {
                    if (account_count > 0) {
                        System.out.println("----------");
                        System.out.println("계좌 목록");
                        System.out.println("----------");

                        for (int i = 0; i < account_count; i++) {
                            System.out.println(Account[i].account_num + "\t" + Account[i].name + "\t" + Account[i].deposit);
                        }

                    } else {
                        System.out.println("계좌가 없습니다. 계좌를 생성하세요.");
                    }
                    break;
                }

                case "3": {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");

                    System.out.print("계좌번호 : ");
                    String number = us_in.nextLine();

                    boolean found = false; // 계좌 존재 여부 확인
                    for (int i = 0; i < account_count; i++) {
                        if (number.equals(Account[i].account_num)) {
                            System.out.print("예금액 : ");
                            int money_deposit = us_in.nextInt();
                            us_in.nextLine(); // ✅ 개행 문자 제거

                            Account[i].money_deposit(money_deposit);
                            System.out.println("현재 잔고> " + Account[i].deposit);
                            found = true; // 계좌를 찾았음
                            break; // ✅ 계좌를 찾으면 반복문 종료
                        }
                    }

                    if (!found) {
                        System.out.println("계좌가 존재하지 않습니다.");
                    }
                    break;
                }

                case "4": {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");

                    System.out.print("계좌번호 : ");
                    String number = us_in.nextLine();

                    boolean found = false;
                    for (int i = 0; i < account_count; i++) {
                        if (number.equals(Account[i].account_num)) {
                            System.out.print("출금액 : ");
                            int money_withdrawl = us_in.nextInt();
                            us_in.nextLine(); // ✅ 개행 문자 제거

                            if (money_withdrawl > Account[i].deposit) {
                                System.out.println("출금액이 현재 잔액보다 큽니다.");
                            } else {
                                Account[i].money_withdrawl(money_withdrawl);
                            }
                            System.out.println("현재 잔고> " + Account[i].deposit);

                            found = true;
                            break; // ✅ 계좌를 찾으면 반복문 종료
                        }
                    }

                    if (!found) {
                        System.out.println("계좌가 존재하지 않습니다.");
                    }
                    break;
                }

                case "5": {
                    prg_exit = false;
                    System.out.println("프로그램 종료");
                    break;
                }
                default: {
                    System.out.println("잘못된 입력입니다 다시 입력하세요.");
                    break;
                }
            }

            System.out.println();
            System.out.println();
        }

        us_in.close();
    }
}
