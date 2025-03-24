package Chapter3;

public class Question2_2_ForLoopArray {
    public static void main(String[] args) {
        Question2_2_ForLoopArray q = new Question2_2_ForLoopArray();
        q.main();
    }

    public void main() {
        // n 배열에서 4의 배수이면서 양수인 수를 출력하는 프로그램
        int[] n = {1, -2, 6, 20, 5, 72, -16, 256};
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.println(n[i] + " ");
            }
        }
    }
}
