package Chapter3;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // 양의정수 10개를 입력받아 일차원 배열에 저장하라.
        // 그리고 저장된 정수 중 3의 배수만 출력하는 프로그램

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("양의 정수를 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
        scanner.close();
    }
}
