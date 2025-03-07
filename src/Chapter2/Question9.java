package Chapter2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        /* (10, 10)과 (200, 300)의 두 점으로 이루어진 사갹형이 있을 때, 정수 x와 y값을 입력받고
        점 (x, y)가 사각형 안에 있는지, 사각형 선 상에 있는지, 사각형 외부에 있는지를 판별하는 프로그램 */
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
