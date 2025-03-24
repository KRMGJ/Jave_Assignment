package Chapter3;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        // 겜블링 게임 프로그램. 사용자가 엔터키를 입력하면 0 1 2 중에서 랜덤하게 3개의 수를 생성하고 출력. 성공이 뜰 때 까지 계속 입력
        // 3개가 모두 같은 값일 때 "성공, 대박났어요!" 출력 후 "계속하시겠습니까?(yes/no) >> "를 출력하고 yes 를 입력하면 다시 게임 시작
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** 겜블링 게임을 시작합니다. *****");
        while (true) {
            System.out.print("엔터키 입력 >> ");
            scanner.nextLine();
            int num1 = (int) (Math.random() * 3);
            int num2 = (int) (Math.random() * 3);
            int num3 = (int) (Math.random() * 3);
            System.out.println(num1 + " " + num2 + " " + num3);
            if (num1 == num2 && num2 == num3) {
                System.out.println("성공, 대박났어요!");
                System.out.print("계속하시겠습니까?(yes/no) >> ");
                String answer = scanner.nextLine();
                if (answer.equals("no")) {
                    break;
                }
            }
        }
        scanner.close();
    }
}
