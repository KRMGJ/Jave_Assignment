package Chapter4;

public class Question11 {
    // 배열을 합치는 프로그램
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}

class ArrayUtil {

//    public static int[] concat(int[] a, int[] b) {
//        int[] result = new int[a.length + b.length];
//        System.arraycopy(a, 0, result, 0, a.length); // a의 시작 인덱스 0부터 a.length 까지
//        System.arraycopy(b, 0, result, a.length, b.length); // b의 시작 인덱스 0부터 b.length 까지
//        return result;
//    }

    public static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }

    public static void print(int[] a) {
        System.out.print("{ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
}