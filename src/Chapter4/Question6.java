package Chapter4;

import lombok.AllArgsConstructor;

public class Question6 {
    public static void main(String[] args) {
        // 사각형을 나타내는 Rectangle 클래스
        Rectangle a = new Rectangle(3,3,6,6);
        Rectangle b = new Rectangle(4,4,2,3);

        a.show();
        if(a.isSquare()){
            System.out.println("a는 정사각형입니다.");
        } else {
            System.out.println("a는 직사각형입니다.");
        }
        if(a.contains(b)){
            System.out.println("a는 b를 포함합니다.");
        }
    }
}

@AllArgsConstructor
class Rectangle {
    int x;
    int y;
    int width;
    int height;

    public boolean isSquare() {
        return width == height;
    }

    public boolean contains(Rectangle r) {
        return x <= r.x && y <= r.y && x + width >= r.x + r.width && y + height >= r.y + r.height;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }
}
