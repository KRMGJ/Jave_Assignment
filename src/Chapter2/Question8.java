package Chapter2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        /* 실수에 대한 사직 연산을 수행하는 프로그램. 연산은 "더하기", "빼기", "곱하기", "나누기"로 구성되며 계산식은
        "2.3 더하기 3.6"과 같이 빈 칸으로 분리하여 입력받아 계산 결과를 출력한다. 0으로 나누기가 입력되면
         "0으로 나눌 수 없습니다"를 출력하고, 연산 명령이 "더하기", "빼기", "곱하기", "나누기"가 아닌 경우,
         "사칙연산이 아닙니다"를 출력하고 종료 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산 입력 >> ");
        double num1 = scanner.nextDouble();
        String operator = scanner.next();
        double num2 = scanner.nextDouble();

        if (operator.equals("더하기")) {
            System.out.println(num1 + " " + operator + " " + num2 + "의 계산 결과는 " + (num1 + num2));
        } else if (operator.equals("빼기")) {
            System.out.println(num1 + " " + operator + " " + num2 + "의 계산 결과는 " + (num1 - num2));
        } else if (operator.equals("곱하기")) {
            System.out.println(num1 + " " + operator + " " + num2 + "의 계산 결과는 " + (num1 * num2));
        } else if (operator.equals("나누기")) {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println(num1 + " " + operator + " " + num2 + "의 계산 결과는 " + (num1 / num2));
            }
        } else {
            System.out.println("사칙연산이 아닙니다.");
        }
        scanner.close();
    }

    public void printResult(double num1, String operator, double num2) {
        switch (operator) {
            case "더하기":
                System.out.println(num1 + " " + operator + " " + num2 + "의 계산 결과는 " + (num1 + num2));
                break;
            case "빼기":
                System.out.println(num1 + " " + operator + " " + num2 + "의 계산 결과는 " + (num1 - num2));
                break;
            case "곱하기":
                System.out.println(num1 + " " + operator + " " + num2 + "의 계산 결과는 " + (num1 * num2));
                break;
            case "나누기":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    System.out.println(num1 + " " + operator + " " + num2 + "의 계산 결과는 " + (num1 / num2));
                }
                break;
            default:
                System.out.println("사칙연산이 아닙니다.");
                break;
        }
    }
}
