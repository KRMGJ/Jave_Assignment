package Chapter2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("생일 입력 하세요 >> ");
        int birth = scanner.nextInt();
        int year = birth / 10000;
        int month = (birth % 10000) / 100;
        int day = birth % 100;
        System.out.println(year + "년 " + month + "월 " + day + "일");

        scanner.close();
    }
}
