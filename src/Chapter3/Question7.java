package Chapter3;

public class Question7 {
    public static void main(String[] args) {
        // 정수를 10개 저장하는 배열을 만들고, 11~19 범위의 정수를 랜덤하게 생성하여 배열에 저장
        // 배열에 들어있는 정수들과 평균을 출력
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9) + 11;
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("평균: " + (double) sum / arr.length);
    }
}
