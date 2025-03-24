package Chapter3;

public class Question1_1 {
    public static void main(String[] args) {
        // 1부터 50까지 3의 배수의 합을 구하는 프로그램
        int sum = 0;
        int i = 1;
        while (true) {
            if (i > 50) {
                break;
            }
            sum += i;
            i += 3;
        }
        System.out.println(sum);
    }
}
