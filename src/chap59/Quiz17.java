package chap59;

public class Quiz17 {

    int a;

    public Quiz17(int a) {
        this.a = a;
    }
    int func() {
        int b = 1;
        for (int i = 1; i < a; i++) {
            b = a * i + b;
        }
        return a + b;
    }

    public static void main(String[] args) {
        Quiz17 obj = new Quiz17(3);
        obj.a = 5;
        int b = obj.func(); // 56
        System.out.print(obj.a + b); // 정답: 5 + 56 = 61
    }
}
