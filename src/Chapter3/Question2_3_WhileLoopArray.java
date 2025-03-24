package Chapter3;

public class Question2_3_WhileLoopArray {
    public static void main(String[] args) {
        // n 배열에서 4의 배수이면서 양수인 수를 출력하는 프로그램
        int[] n = {1, -2, 6, 20, 5, 72, -16, 256};
        int i = 0;
        while (i < n.length) {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.println(n[i] + " ");
            }
            i++;
        }
    }
}
