package Chapter2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // 여행 경비 계산 프로그램. 방 하나에 2명제한. 1명만 투숙해도 1방의 비용을 지불
        Scanner scanner = new Scanner(System.in);

        System.out.println("여행지 >> ");
        String destination = scanner.nextLine();

        System.out.println("인원수 >> ");
        int people = scanner.nextInt();

        System.out.println("숙박일 >> ");
        int days = scanner.nextInt();

        System.out.println("1박당 항공료 >> ");
        int flight = scanner.nextInt();

        System.out.println("1방 숙박비 >> ");
        int room = scanner.nextInt();

        System.out.println(people + "명의 " + destination + " " + days + "박" + days + "일 여행에는 방이 " + (people / 2 + people % 2) + "개 필요하며 경비는 " + (flight * people + room * (people / 2 + people % 2) * days) + "원 입니다.");

        scanner.close();
    }
}
