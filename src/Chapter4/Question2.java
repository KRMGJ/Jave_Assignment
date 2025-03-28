package Chapter4;

import lombok.AllArgsConstructor;

public class Question2 {
    public static void main(String[] args) {
        // 큐브의 부피를 구하는 프로그램
        Cube cube = new Cube(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        cube.increase(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        if (cube.isZero()) {
            System.out.println("큐브의 부피는 0");
        } else {
            System.out.println("큐브의 부피는 0이 아님");
        }
    }
}

@AllArgsConstructor
class Cube {
    int length;
    int width;
    int height;

    public int getVolume() {
        return length * width * height;
    }

    public void increase(int length, int width, int height) {
        this.length += length;
        this.width += width;
        this.height += height;
    }

    public boolean isZero() {
        return length == 0 && width == 0 && height == 0;
    }
}