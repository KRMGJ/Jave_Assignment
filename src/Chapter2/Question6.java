package Chapter2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /* 빨간 초는 10살 파란 초는 5살 노란 초는 1살일 때 나이에 맞는 초의 개수를 계산하는 프로그램.
        이 때 전체 초의, 개수가 최소가 되게 하라. 나이에 0이나 음수가 입력되면 "나이는 양수로만 입력하세요." 출력 후 프로그램 종료 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요 >> ");
        int age = scanner.nextInt();
        int red = 10, blue = 5, yellow = 1;

        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요.");
            return;
        } else {
            int redCount = age / red;
            int blueCount = 0;
            int yellowCount = 0;
            int rest = age % red;

            if (rest % blue == 0) {
                blueCount = rest / blue;
            } else {
                blueCount = rest / blue;
                yellowCount = rest % blue;
            }

            System.out.println("빨간 초 " + redCount + "개, 파란 초 " + blueCount + "개, 노란 초 " + yellowCount + "개. " + "총 " + (redCount + blueCount + yellowCount) + "개가 필요합니다.");
        }
        scanner.close();
    }
}
