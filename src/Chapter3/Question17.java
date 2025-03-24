package Chapter3;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        // 커피와 가격을 각각 배열로 만들고, 이를 활용하여 주문을 받아 가격을 계산하는 프로그램
        // 그만을 입력하면 주문을 종료
        String[] coffee = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int[] price = {3000, 3500, 4000, 5000};
        Scanner scanner = new Scanner(System.in);
        System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.");
        while (true) {
            System.out.print("주문 >> ");
            String order = scanner.next();
            if (order.equals("그만")) {
                break;
            }
            int amount;
            try {
                amount = scanner.nextInt();
            } catch (Exception exception) {
                System.out.println("잔 수는 양의 정수로 입력해주세요!");
                scanner.nextLine();
                continue;
            }
            int index = -1;
            for (int i = 0; i < coffee.length; i++) {
                if (order.equals(coffee[i])) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println(order + "는 없는 메뉴입니다.");
            } else {
                System.out.println("가격은 " + price[index] * amount + "원입니다.");
            }
        }

    }
}
