package Chapter3;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        // 사용자로부터 "남" 혹은 "여"를 입력받아, 남자 또는 여자의 이름을 작명하는 프로그램
        // 다음 실행 예시와 같이 "그만"을 입력하면 프로그램은 종료
        Scanner scanner = new Scanner(System.in);
        String[] boyMiddleList = {"기", "민", "용", "종", "현", "진", "재", "승", "소", "상", "지"};
        String[] boyLastList = {"태", "진", "광", "혁", "우", "철", "빈", "준", "구", "호", "석"};
        String[] girlMiddleList = {"은", "원", "경", "수", "현", "예", "여", "송", "서", "채", "하"};
        String[] girlLastList = {"진", "연", "경", "서", "리", "숙", "미", "원", "린", "희", "수"};

        while (true) {
            System.out.print("남/여 선택 >> ");
            String gender = scanner.next();
            if (gender.equals("그만")) {
                break;
            } else if (!gender.equals("남") && !gender.equals("여")) {
                System.out.println("남/여/그만 중에서 입력하세요!");
                continue;
            }

            System.out.print("성 입력 >> ");
            String lastName = scanner.next();

            String middleName;
            String firstName;
            if (gender.equals("남")) {
                middleName = boyMiddleList[(int) (Math.random() * boyMiddleList.length)];
                firstName = boyLastList[(int) (Math.random() * boyLastList.length)];
            } else {
                middleName = girlMiddleList[(int) (Math.random() * girlMiddleList.length)];
                firstName = girlLastList[(int) (Math.random() * girlLastList.length)];
            }

            System.out.println("추천 이름: " + lastName + middleName + firstName);
        }
        scanner.close();
    }
}