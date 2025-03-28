package Chapter4;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // 이름, 자바, 웹프로그래밍, 운영체제 점수를 입력받아 평균을 구하는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>> ");
        String name = scanner.next();
        int java = scanner.nextInt();
        int web = scanner.nextInt();
        int os = scanner.nextInt();
        Grade st = new Grade(name, java, web, os);
        System.out.println(st.getName() + "의 평균은 " + st.getAverage());
        scanner.close();
    }
}

@Getter
@AllArgsConstructor
class Grade {
    String name;
    int java;
    int web;
    int os;

    public int getAverage() {
        return (java + web + os) / 3;
    }
}