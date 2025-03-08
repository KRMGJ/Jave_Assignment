package Chapter2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 상태 입력 >> ");
        int status = scanner.nextInt();

        int temperature = status & 0b00111111;
        int aircon = (status & 0b01000000) >> 6;
        int running = (status & 0b10000000) >> 7;

        String runningStatus = (running == 1) ? "달리는 상태" : "정지 상태";
        String airconStatus = (aircon == 1) ? "에어컨이 켜진 상태" : "에어컨이 꺼진 상태";

        System.out.println("자동차는 " + runningStatus + "이고 " + airconStatus + "이고 온도는 " + temperature + "도이다.");

        scanner.close();
    }
}
