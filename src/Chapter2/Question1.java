package Chapter2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // 입력받은 달러를 원화로 환산
        Scanner scanner = new Scanner(System.in);

        System.out.println("$1 = 1200원입니다. 달러를 입력하세요 >> ");
        int dollar = scanner.nextInt();
        int won = dollar * 1200;
        System.out.println(dollar + "달러는 " + won + "원입니다.");
        scanner.close();
    }
}
