package Chapter3;

public class Question1_2_WhileLoop {
    public static void main(String[] args) {
        Question1_2_WhileLoop q = new Question1_2_WhileLoop();
        q.main();
    }

    public void main() {
        // 1부터 50까지 3의 배수의 합을 구하는 프로그램
        int sum = 0;
        int i = 1;
        while (i <= 50) {
            sum += i;
            i += 3;
        }
        System.out.println(sum);
    }
}

