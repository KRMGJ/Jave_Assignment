package Chapter2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Rice_cake = 2000;
        int Rolled_seaweed = 1000;
        int Jjolmyeon = 3000;

        System.out.println("떡볶이 몇 인분 >> ");
        int Rice_cake_count = scanner.nextInt();

        System.out.println("김말이 몇 인분 >> ");
        int Rolled_seaweed_count = scanner.nextInt();

        System.out.println("쫄면 몇 인분 >> ");
        int Jjolmyeon_count = scanner.nextInt();

        int total = Rice_cake * Rice_cake_count + Rolled_seaweed * Rolled_seaweed_count + Jjolmyeon * Jjolmyeon_count;
        System.out.println("전체 금액은 " + total + "원입니다.");

        scanner.close();
    }
}
