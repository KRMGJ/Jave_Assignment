package Chapter2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        /* 냉장고의 상태를 나타내기 위해 8비트 정수 중 하위 4비트가 사용된다.
        비트0 : 값이 0이면 전원이 꺼져있고, 1이면 켜져 있음
        비트1 : 값이 0이면 문이 열려 있고, 1이면 닫혀 있음
        비트2 : 값이 0이면 냉장고 전구가 손상된 상태이고, 1이면 정상 작동
        비트3 : 값이 0이면 냉장고 온도가 3도 이상이고, 1이면 3도 미만
        비트 4이상 : 아무 의미 없음
        이 때 냉장고의 상태를 나타내는 8비트를 입력받고 하위 4비트를 분석하여 냉장고의 상태를 출력하는 프로그램 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("냉장고 상태 입력 >> ");
        int status = scanner.nextInt();
        int power = status & 0b0001;
        int door = status & 0b0010;
        int light = status & 0b0100;
        int temperature = status & 0b1000;

        System.out.println("전원 켜져 있음");
        System.out.println("전원 꺼져 있음");
        System.out.println("문 열려 있음");
        System.out.println("문 닫혀 있음");
        System.out.println("전구 정상 작동");
        System.out.println("전구 손상된 상태");
        System.out.println("냉장고 온도 3도 미만");
        System.out.println("냉장고 온도 3도 이상");

    }
}
