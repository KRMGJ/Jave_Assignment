package Chapter2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /* 출석점수가 총 100점일 때 지각하면 3점 결석하면 8점 감점. 이름, 지각횟수, 결석횟수 순으로 입력할 때
        두 학생 중 누구의 출석점수가 높은지 판단하는 프로그램 점수가 같은 경우 "점수동일" */
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
