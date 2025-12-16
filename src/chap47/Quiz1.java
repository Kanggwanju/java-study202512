package chap47;

// 실습 퀴즈 1
public class Quiz1 {

    public static void main(String[] args) {

        int[] nums = {12, 17, 8, 41, 30, 22};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }

        // 정답 72
        System.out.println(sum);
    }
}
