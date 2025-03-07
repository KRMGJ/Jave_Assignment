package Chapter2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        /*사각형을 구성하는 두 점 (x1, y1), (x2, y2)를 입력받고 이 사각형이 (10,10)과 (200,300) 의
        사각형에 완전히 포함되면 "포함된다", ㅏㅇ니면 "포함되지 않는다"를 출력하는 프로그램 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("(x1, y1), (x2, y2)의 좌표 입력 >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if ((x1 > 10 && x1 < 200) && (y1 > 10 && y1 < 300) && (x2 > 10 && x2 < 200) && (y2 > 10 && y2 < 300)) {
            System.out.println("(" + x1 + ", " + y1 + ") (" + x2 + ", " + y2 + ") 사각형은 "+ "(10,10) (200,300) 사각형에 포함된다.");
        } else {
            System.out.println("(" + x1 + ", " + y1 + ") (" + x2 + ", " + y2 + ") 사각형은 "+ "(10,10) (200,300) 사각형에 포함되지 않는다.");
        }
        scanner.close();
    }
}
