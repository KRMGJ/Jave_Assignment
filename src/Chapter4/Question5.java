package Chapter4;

import lombok.AllArgsConstructor;

public class Question5 {
    public static void main(String[] args) {
        Song song = new Song("가로수 그늘 아래 서면", "이문세", "1988", "한국");
        song.show();
    }
}

@AllArgsConstructor
class Song {
    String title;
    String singer;
    String year;
    String lang;

    public void show() {
        System.out.println(year + "년 " + lang + "의 " + singer + "가 부른 " + title);
    }
}