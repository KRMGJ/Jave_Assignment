package Chapter4;

import lombok.AllArgsConstructor;

public class Question1 {
    public static void main(String[] args) {
        // Samsung 에서 만든 300만원짜리의 50인치 TV
        TV tv = new TV("Samsung", 50, 300);
        tv.show();
    }
}

@AllArgsConstructor
class TV {
    String brand;
    int inch;
    int price;

    public void show() {
        System.out.println(brand + "에서 만든 " + price + "만원짜리 " + inch + "인치 TV");
    }
}