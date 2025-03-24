package Chapter3;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        // 2개의 정수를 입력받아 곱을 구하는 프로그램.
        // 정수가 이닌것이 입력되면 라인3 또는 4에서 InputMismatchException 발생
        // try catch 를 이용하여 예외 처리, 정수가 입력될때까지 계속 입력받고 곱을 출력
        // 예외가 발생하면 "정수를 입력하세요!" 출력
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("두 정수를 입력하세요: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
                break;
            } catch (Exception exception) {
                System.out.println("정수를 입력하세요!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
