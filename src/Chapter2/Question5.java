package Chapter2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 100;

        System.out.println("학생1 >> ");
        String name1 = scanner.next();
        int late1 = scanner.nextInt();
        int absent1 = scanner.nextInt();

        System.out.println("학생2 >> ");
        String name2 = scanner.next();
        int late2 = scanner.nextInt();
        int absent2 = scanner.nextInt();

        System.out.println(name1 + "의 감점은 " + (late1 * 3 + absent1 * 8) + ", " + name2 + "의 감점은 " + (late2 * 3 + absent2 * 8));
        if (late1 * 3 + absent1 * 8 > late2 * 3 + absent2 * 8) {
            System.out.println(name2 + "의 출석점수가 높음. " + name2 + "출석 점수는 " + (total - (late2 * 3 + absent2 * 8)));
        } else if (late1 * 3 + absent1 * 8 < late2 * 3 + absent2 * 8) {
            System.out.println(name1 + "의 출석점수가 높음. " + name1 + "출석 점수는 " + (total - (late1 * 3 + absent1 * 8)));
        } else {
            System.out.println("점수동일");
        }

        scanner.close();
    }
}
