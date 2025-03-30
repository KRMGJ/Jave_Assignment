package Chapter4;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Concert concert = new Concert();
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (true) {
            System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4>> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> concert.reserveSeat(scanner);
                case 2 -> concert.show();
                case 3 -> concert.cancelReservation(scanner);
                case 4 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}

class Concert {
    private final String[][] seats = {new String[10], new String[10], new String[10]};
    private final String[] seatTypes = {"S", "A", "B"};

    public void reserveSeat(Scanner scanner) {
        int type = getSeatType(scanner);
        if (type == -1) return;
        showType(type);

        System.out.print("이름>> ");
        String name = scanner.next();
        System.out.print("번호>> ");
        int number = scanner.nextInt();

        if (number < 0 || number >= 10 || seats[type][number] != null) {
            System.out.println("잘못된 좌석 번호이거나 이미 예약된 좌석입니다.");
            return;
        }
        seats[type][number] = name;
    }

    public void show() {
        for (int i = 0; i < 3; i++) showType(i);
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void cancelReservation(Scanner scanner) {
        int type = getSeatType(scanner);
        if (type == -1) return;
        showType(type);

        System.out.print("이름>> ");
        String name = scanner.next();

        for (int i = 0; i < 10; i++) {
            if (name.equals(seats[type][i])) {
                seats[type][i] = null;
                return;
            }
        }
        System.out.println("예약된 이름이 없습니다.");
    }

    private int getSeatType(Scanner scanner) {
        System.out.print("좌석구분 S(1), A(2), B(3)>> ");
        int type = scanner.nextInt() - 1;
        if (type < 0 || type >= 3) {
            System.out.println("잘못된 좌석 타입입니다. 다시 시도하세요.");
            return -1;
        }
        return type;
    }

    private void showType(int type) {
        System.out.print(seatTypes[type] + ">> ");
        for (String seat : seats[type]) System.out.print((seat == null ? "---" : seat) + " ");
        System.out.println();
    }
}
