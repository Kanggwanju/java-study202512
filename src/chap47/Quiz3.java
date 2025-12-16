package chap47;

// 실습 퀴즈 3
public class Quiz3 {

    public static void main(String[] args) {

        int[][] scores = {{10, 20}, {30, 40, 50}, {60}};
        int result = 0;

        result += scores[1].length; // 3
        result += scores[2][0]; // 60

        // 정답 63
        System.out.println(result);
    }
}
