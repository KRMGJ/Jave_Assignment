package Chapter4;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Question8 {
    public static void main(String[] args) {
        // 계좌 잔고를 관리하는 프로그램
        Account a = new Account(100);
        a.deposit(5000);
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int[] bulk = {100, 500, 200, 700};
        a.deposit(bulk);
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int money = 1000;
        int wMoney = a.withdraw(money);
        if (wMoney < money) {
            System.out.println(wMoney + "원만 인출");
        } else {
            System.out.println(money + "원 인출");
        }
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");
    }
}

@Getter
@AllArgsConstructor
class Account {
    int balance;

    public void deposit(int money) {
        balance += money;
    }

    public void deposit(int[] money) {
        for (int i = 0; i < money.length; i++) {
            balance += money[i];
        }
    }

    public int withdraw(int money) {
        if (money > balance) {
            return balance;
        } else {
            balance -= money;
            return money;
        }
    }
}