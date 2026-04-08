package chap59;

public class Quiz4 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i < 10) {
            i++;
            if (i % 2 == 1)
                continue;
            sum += i;
        }

        // 정답: 2 4 6 8 10 => 30
        System.out.println(sum);
    }
}
