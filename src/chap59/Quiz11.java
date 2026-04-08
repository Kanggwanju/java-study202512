package chap59;
// 클래스, 상속
class ovr {
    int sun(int x, int y) {
        return x + y;
    }
}
class ovr1 extends ovr {
    int sun(int x, int y) {
        return x + y;
    }
}
class ovr2 extends ovr1 {
    int sun(int x, int y) {
        return x - y + super.sun(x, y);
    }
}

public class Quiz11 {
    public static void main(String[] args) {
        ovr a1 = new ovr1();
        ovr a2 = new ovr2();

        // 정답: 5 + 6 -> 11
        System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
    }
}
