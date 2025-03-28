package Chapter4;

public class Question4 {
    public static void main(String[] args) {
        // 평균을 구하는 프로그램
        Average avg = new Average();
        avg.put(10);
        avg.put(15);
        avg.put(100);
        avg.showAll();
        System.out.println("평균은 " + avg.getAverage());
    }
}

class Average {
    int[] arr = new int[10];
    int index = 0;

    public void put(int num) {
        if (index < 10) {
            arr[index] = num;
            index++;
        }
    }

    public void showAll() {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }
        return (double) sum / index;
    }
}
