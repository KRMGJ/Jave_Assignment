package Chapter3;

public class Question1_3_ForLoop {
    public static void main(String[] args) {
        // 1부터 50까지 3의 배수의 합을 구하는 프로그램
        int sum = 0;
        for (int i = 1; i <= 50; i += 3) {
            sum += i;
        }
        System.out.println(sum);
    }
}
