package chap47;

// 실습 퀴즈 4
public class Quiz4 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int temp;

        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        // 정답: 40 + 20 = 60
        System.out.println(arr[1] + arr[3]);
    }
}
