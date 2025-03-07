package Chapter2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        /* 자동차의 상태를 나타내는 정수형 변수의 각 비트는 자동차의 상태를 나타낸다.
        비트 0~5 : 현재 자동차 내 온도 값으로, 10진수로는 0~31의 값
        비트 6 : 값이 0이면 에어컨이 꺼져 있는 상태. 1이면 켜져 있는 상태
        비트 7 : 값이 0이면 자동차가 정지 상태. 1이면 달리는 상태
        비트 8이상 : 아무 의미 없음
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 상태 입력 >> ");
        int status = scanner.nextInt();

        int temperature = status & 0b00111111; //
        int aircon = (status & 0b01000000) >> 6;
        int running = (status & 0b10000000) >> 7;

        System.out.print("자동차는 ");
        if (running == 1) {
            System.out.print("달리는 상태");
        } else {
            System.out.print("정지 상태");
        }
        System.out.print("이고 ");
        if (aircon == 1) {
            System.out.print("에어컨이 켜진 상태");
        } else {
            System.out.print("에어컨이 꺼진 상태");
        }
        System.out.println("이고 온도는 " + temperature + "도이다.");
        scanner.close();
        System.out.println("나는 \"JAVA를 "+100+"%\""+"사랑해");
    }
}
