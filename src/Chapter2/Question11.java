package Chapter2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("냉장고 상태 입력 >> ");
        String binaryInput = scanner.next();
        int status = Integer.parseInt(binaryInput, 2);

        if ((status & 0b0001) != 0) {
            System.out.println("전원 켜져 있음");
        } else {
            System.out.println("전원 꺼져 있음");
        }
        if ((status & 0b0010) != 0) {
            System.out.println("문 닫혀 있음");
        } else {
            System.out.println("문 열려 있음");
        }
        if ((status & 0b0100) != 0) {
            System.out.println("전구 정상 작동");
        } else {
            System.out.println("전구 손상된 상태");
        }
        if ((status & 0b1000) != 0) {
            System.out.println("냉장고 온도 3도 미만");
        } else {
            System.out.println("냉장고 온도 3도 이상");
        }
        scanner.close();
    }
}
