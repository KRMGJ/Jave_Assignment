package Chapter2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("냉장고 상태 입력 >> ");
        String binaryInput = scanner.next();
        int status = Integer.parseInt(binaryInput, 2);

        String powerStatus = (status & 0b0001) != 0 ? "전원 켜져 있음" : "전원 꺼져 있음";
        String doorStatus = (status & 0b0010) != 0 ? "문 닫혀 있음" : "문 열려 있음";
        String lightStatus = (status & 0b0100) != 0 ? "전구 정상 작동" : "전구 손상된 상태";
        String temperatureStatus = (status & 0b1000) != 0 ? "냉장고 온도 3도 미만" : "냉장고 온도 3도 이상";

        System.out.println(powerStatus + ". " + doorStatus + ". " + lightStatus + ". " + temperatureStatus + ".");

        scanner.close();
    }
}
