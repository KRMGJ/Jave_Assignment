package Chapter3;

public class Question1_4_DoWhileLoop {
    public static void main(String[] args) {
        // 1부터 50까지 3의 배수의 합을 구하는 프로그램
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i += 3;
        } while (i <= 50);
        System.out.println(sum);
    }
}
