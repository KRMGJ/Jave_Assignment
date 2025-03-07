package Chapter2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
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
