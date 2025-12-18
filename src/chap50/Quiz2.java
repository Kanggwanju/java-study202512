package chap50;

public class Quiz2 {
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    // 파라미터의 값에 따른 내부 검증 로직
    public void setBalance(int newBalance) {
        if (newBalance >= 0) {
            this.balance = newBalance;
        } else {
            this.balance = 0;
        }
    }
}
