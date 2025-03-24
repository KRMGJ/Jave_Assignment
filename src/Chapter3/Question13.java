package Chapter3;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        // 과목 학점이 들어있는 2개의 배열을 활용하여 과목명을 입력받아 학점을 출력
        // 그만이 입력되면 프로그램을 종료
        Scanner scanner = new Scanner(System.in);
        String[] course = {"C", "C++", "Python", "Java", "HTML5"};
        String[] grade = {"A", "B+", "B", "A+", "D"};

        while (true) {
            System.out.print("과목 >> ");
            String input = scanner.next();
            if (input.equals("그만")) {
                break;
            }
            int index = -1;
            for (int i = 0; i < course.length; i++) {
                if (input.equals(course[i])) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println(input + "는 없는 과목입니다.");
            } else {
                System.out.println(course[index] + " 학점은 " + grade[index]);
            }
        }
    }
}
