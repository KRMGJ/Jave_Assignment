package Chapter4;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        VArray v = new VArray(5);
        // 용량: 5, 저장된 개수: 0
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());

        for (int i = 0; i < 7; i++) {
            v.add(i); // 배열에 순서대로 정수 i를 저장
        }
        // 용량: 10, 저장된 개수: 7
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        // 0, 1, 2, 3, 4, 5, 6
        v.printAll();

        v.insert(3, 100); // 배열의 3번째 인덱스에 100을 저장
        v.insert(5, 200); // 배열의 5번째 인덱스에 200을 저장
        // 용량: 10, 저장된 개수: 9
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        // 0, 1, 2, 100, 3, 200, 4, 5, 6
        v.printAll();

        v.remove(10); // 배열의 10번째 인덱스값을 삭제
        // 용량: 10, 저장된 개수: 9
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        // 0, 1, 2, 100, 3, 200, 4, 5, 6
        v.printAll();

        for (int i = 50; i < 55; i++) {
            v.add(i); // 배열에 순서대로 정수 i를 저장
        }
        // 용량: 20, 저장된 개수: 14
        System.out.println("용량: " + v.capacity() + ", 저장된 개수: " + v.size());
        // 0, 1, 2, 100, 3, 200, 4, 5, 6, 50, 51, 52, 53, 54
        v.printAll();
    }
}

@NoArgsConstructor
class VArray {
    private int[] array;
    private int count;

    public VArray(int size) {
        array = new int[size];
        count = 0;
    }

    public int capacity() {
        return array.length;
    }

    public int size() {
        return count;
    }

    public void add(int value) {
        ensureCapacity();
        array[count++] = value;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > count) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        ensureCapacity();
        System.arraycopy(array, index, array, index + 1, count - index);
        array[index] = value;
        count++;
    }

    public void remove(int index) {
        array[index-1] = 0; // 삭제할 원소를 0으로 변경
    }

    private void ensureCapacity() {
        if (count == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

    public void printAll() {
        System.out.print("배열: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}