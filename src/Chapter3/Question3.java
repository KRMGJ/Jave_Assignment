package Chapter3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Scanner 를 이용하여 양의 정수를 입력받고 다음과 같이 *을 출력되는 프로그램을 작성하라
        // 양의 정수가 입력될 때까지 계속 입력을 받아야 한다.
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("양의 정수를 입력하세요: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
