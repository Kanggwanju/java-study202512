package chap60;

public class Quiz21 {
    public static void main(String[] args) {
        int a = 0;

        for (int i = 1; i < 999; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                a = i;
            }
        }
        // 정답: 993 (3의 배수이지만 2의 배수는 아닌 가장 큰 수)
        System.out.print(a);
    }
}
