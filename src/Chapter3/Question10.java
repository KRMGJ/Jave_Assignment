package Chapter3;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // 4x4 크기의 2차원 정수 배열에 0~225 범위의 정수 16개를 랜덤하게 생성하여 초기화 하여 출력.
        // 임계값을 입력받고, 배열에 저장된 정수가 임계값보다 크면 255, 작거나 같으면 0으로 배열을 수정 후 출력
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[4][4];
        for (int i = 0; i < 16; i++) {
            int row = (int) (Math.random() * 4);
            int col = (int) (Math.random() * 4);
            if (arr[row][col] == 0) {
                arr[row][col] = (int) (Math.random() * 226);
            } else {
                i--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("임계값을 입력하세요 : ");
        int threshold = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > threshold) {
                    arr[i][j] = 255;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}