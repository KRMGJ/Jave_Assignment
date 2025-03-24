package Chapter3;

public class Question4 {
    public static void main(String[] args) {
        // 2차원 배열 n을 실행 사례와 같이 출력하는 프로그램
        int[][] n = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
