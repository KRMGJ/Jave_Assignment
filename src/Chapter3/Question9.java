package Chapter3;

public class Question9 {
    public static void main(String[] args) {
        // 4x4 크기의 2차원 정수 배열을 생성하고, 0~225 범위의 정수 16개를 랜덤하게 생성
        // 정수를 저장 후 배열을 출력

        int[][] arr = new int[4][4];
        for (int i = 0; i < 16; i++) {
            int row = (int) (Math.random() * 4);
            int col = (int) (Math.random() * 4);
            if (arr[row][col] == 0) {
                arr[row][col] = (int) (Math.random() * 226);
            } else {
                i--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
