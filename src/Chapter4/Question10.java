package Chapter4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // 한 달의 다이어리를 관리하는 프로그램
        Scanner scanner = new Scanner(System.in);
        MonthDiary monthDiary = new MonthDiary();
        System.out.println("***** 2025 03월 다이어리 *****");

        while (true) {
            System.out.print("기록: 1, 보기: 2, 종료:3>> ");
            int choice = scanner.nextInt();
            if (choice == 3) {
                break;
            } else if (choice == 1) {
                System.out.print("날짜(1~30)와 텍스트(빈칸없이 4글자 이하)>> ");
                int day = scanner.nextInt();
                String content = scanner.next();
                monthDiary.diary[day - 1] = new DayDiary(day, content);
            } else if (choice == 2) {
                monthDiary.show();
            }
        }
        System.out.println("다이어리를 종료합니다.");
        scanner.close();
    }
}

@Getter
@AllArgsConstructor
class DayDiary {
    int day;
    String content;

}

class MonthDiary {
    DayDiary[] diary = new DayDiary[30];

    public void show() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                int index = i * 7 + j; // 0~34
                if (index < diary.length) {
                    if (diary[index] != null) {
                        System.out.print(diary[index].getContent() + "\t"); // 내용 출력
                    } else {
                        System.out.print("...\t");
                    }
                }
            }
            System.out.println();
        }
    }
}

