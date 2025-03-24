package Chapter3;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        // 구구단 퀴즈의 답을 검사하는 프로그램.
        // 랜덤하게 구구단을 묻고 사용자의 답을 입력받아 정답인지 판단
        // 3번 틀리면 종료
        Scanner scanner = new Scanner(System.in);
        int wrong = 0;
        System.out.println("***** 구구단을 맞추는 퀴즈입니다. *****");

        while (true) {
            int num1 = (int) (Math.random() * 9) + 1;
            int num2 = (int) (Math.random() * 9) + 1;
            System.out.print(num1 + " * " + num2 + " = ");
            int answer = scanner.nextInt();
            if (answer == num1 * num2) {
                System.out.println("정답입니다. 잘했습니다.");
            } else {
                System.out.println("틀렸습니다. 분발하세요");
                wrong++;
            }
            if (wrong == 3) {
                System.out.println("3번 틀렸습니다. 퀴즈 종료합니다");
                break;
            }
        }
        scanner.close();
    }
}
