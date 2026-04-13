package chap60;
// 오버로딩, 재귀
public class Quiz39 {
    public static void main(String[] args) {
        // 정답: 4
        System.out.println(calc("5"));
    }

    static int calc(int value) {
        if (value <= 1) return value;
        return calc(value - 1) + calc (value - 2);
    }
    static int calc(String str) {
        int value = Integer.valueOf(str); // 5
        if (value <= 1) return value;
        return calc(value - 1) + calc(value - 3);
    }
}
