package Chapter4;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        // 한글 단어를 입력받아 영어로 변환하는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.print("한글 단어? ");
            String word = scanner.next();
            if (word.equals("그만")) {
                break;
            }
            String result = Dictionary.kor2Eng(word);
            System.out.println(result != null ? word + "는 " + result : word + "는 저의 사전에 없습니다.");
        }
    }
}

class Dictionary {
    private static final String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static final String[] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return eng[i];
            }
        }
        return null; // 단어가 없을 경우 null 반환
    }
}
