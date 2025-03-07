package Chapter2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
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
