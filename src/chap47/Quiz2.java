package chap47;

// 실습 퀴즈 2
public class Quiz2 {

    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "apple", "mango", "apple"};
        int count = 0;
        
        // 향상된 for 문
        for (String fruit : fruits) {
            // 문자열을 비교할 때 equals 사용
            if (fruit.equals("apple")) {
                count++;
            }
        }

        // 정답: 3
        System.out.println(count);
    }
}
