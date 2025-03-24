package Chapter3;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // 몇 개의 정수를 저장할 것인지 개수를 입력받고, 그만큼의 배열을 생성
        // 배열에 1~100 범위의 랜덤한 정수를 저장한 후, 정수들과 평균을 출력. 단, 같은 정수가 저장되면 안됨
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 정수를 저장할 것인가요? : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 100) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    i--;
                    break;
                }
            }
            arr[i] = num;
            sum += num;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("평균: " + (double) sum / n);
        scanner.close();
    }
}
