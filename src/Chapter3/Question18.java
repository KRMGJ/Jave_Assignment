package Chapter3;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        // 1차원 정수 배열을 2개 생성하고 10명 학생의 학번과 점수를 입력받아 저장
        // 학번을 입력하면 학생의 점수를 출력
        Scanner scanner = new Scanner(System.in);
        int[] studentId = new int[10];
        int[] studentScore = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " >> ");
            try {
                studentId[i] = scanner.nextInt();
                studentScore[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("경고!! 정수를 입력하세요.");
                scanner.nextLine();
                i--;
            }
        }
        while (true) {
            int choice;
            do {
                System.out.print("학번으로 검색: 1, 점수로 검색:2, 끝내려면 3 >> ");
                try {
                    choice = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("경고!! 정수를 입력하세요.");
                    scanner.nextLine();
                }
            } while (true);

            if (choice == 1) {
                int id;
                while (true) {
                    System.out.print("학번 >> ");
                    try {
                        id = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("경고!! 정수를 입력하세요.");
                        scanner.nextLine();
                    }
                }
                boolean found = false;
                for (int i = 0; i < 10; i++) {
                    if (studentId[i] == id) {
                        System.out.println(studentScore[i] + "점");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(id + "의 학생은 없습니다.");
                }
            } else if (choice == 2) {
                int score;
                while (true) {
                    System.out.print("점수 >> ");
                    try {
                        score = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("경고!! 정수를 입력하세요.");
                        scanner.nextLine();
                    }
                }
                boolean found = false;

                int[] matchingIds = new int[10];
                int count = 0;
                for (int i = 0; i < 10; i++) {
                    if (studentScore[i] == score) {
                        matchingIds[count++] = studentId[i];
                        found = true;
                    }
                }
                if (found) {
                    System.out.print("점수가 " + score + "인 학생은 ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(matchingIds[i] + " ");
                    }
                    System.out.println("입니다.");
                } else {
                    System.out.println("점수가 " + score + "점인 학생은 없습니다.");
                }
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        scanner.close();
    }
}