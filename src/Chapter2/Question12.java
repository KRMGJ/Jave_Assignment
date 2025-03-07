package Chapter2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
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
