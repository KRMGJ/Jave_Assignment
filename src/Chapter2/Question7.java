package Chapter2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        /* 숫자를 입력받아 3~5는 "따뜻한 봄". 6~8은 "바다가 즐거운 여름". 9~11은 "낙엽이 지는 아름다운 가을".
        12,0,1의 경우 "눈 내리는 하얀 겨울"을, 그 외 숫자를 입력한 경우 "1~12만 입력하세요."를 출력하는 프로그램 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력하세요(1~12) >> ");
        int month = scanner.nextInt();

        if (month >= 3 && month <= 5) {
            System.out.println("따뜻한 봄");
        } else if (month >= 6 && month <= 8) {
            System.out.println("바다가 즐거운 여름");
        } else if (month >= 9 && month <= 11) {
            System.out.println("낙엽이 지는 아름다운 가을");
        } else if (month == 12 || month == 0 || month == 1) {
            System.out.println("눈 내리는 하얀 겨울");
        } else {
            System.out.println("1~12만 입력하세요.");
        }
        scanner.close();
    }

    public void printResult(int month) {
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("따뜻한 봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("바다가 즐거운 여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("낙엽이 지는 아름다운 가을");
                break;
            case 12:
            case 0:
            case 1:
                System.out.println("눈 내리는 하얀 겨울");
                break;
            default:
                System.out.println("1~12만 입력하세요.");
                break;
        }
    }
}
