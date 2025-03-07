package Chapter2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점 (x, y)의 좌표를 입력 >> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x > 10 && x < 200) && (y > 10 && y < 300)) {
            System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다.");
        } else if ((x == 10 || x == 200) && (y >= 10 && y <= 300) ||
                (y == 10 || y == 300) && (x >= 10 && x <= 200)) {
            System.out.println("(" + x + ", " + y + ")는 사각형 선 상에 있습니다.");
        } else {
            System.out.println("(" + x + ", " + y + ")는 사각형 밖에 있습니다.");
        }
        scanner.close();
    }
}
