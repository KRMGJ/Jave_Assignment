package Chapter3;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // 양의 정수 10개를 입력받아 일차원 배열에 저장하라.
        // 그리고 일차원 배열에서 각 수를 분석하여 자리수의 합이 9인 것을 가려내어 출력
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("양의 정수를 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int num = arr[i];
            while (num > 0) {
                sum += num % 10; // 1의 자리수를 더함
                num /= 10; // 1의 자리수를 없앰
            }
            if (sum == 9) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
