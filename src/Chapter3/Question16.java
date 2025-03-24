package Chapter3;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Question16 {
    public static void main(String[] args) {
        // 양수들을 한 줄에 입력받고 평균을 구하는 프로그램
        // 입럭에서 양수가 아닌 것들은 모두 빼고 평균을 출력
        // -1을 입력하면 입력을 종료하고 평균을 출력
        // 문자열과 실수 입력에 대해서는 exception 처리하고 0과 음수는 조건문으로 처리하여 합에서 배제

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("양의 정수를 입력하세요. (종료: -1) : ");
        while (true) {
            String input = null;
            try {
                input = scanner.next();
                if (input.equals("-1")) {
                    break;
                }
                int num = parseInt(input);
                if (num <= 0) {
                    continue;
                }
                sum += num;
                count++;
            } catch (Exception e) {
                System.out.println(input + " 제외");
                scanner.next();
            }
        }
        System.out.println("평균은 " + (double) sum / count);
        scanner.close();
    }
}
