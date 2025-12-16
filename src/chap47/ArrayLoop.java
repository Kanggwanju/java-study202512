package chap47;

public class ArrayLoop {

    public static void main(String[] args) {

        int[] scores = {95, 88, 100, 72, 67, 80};
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번째 점수: %d\n", i+1, scores[i]);
            total += scores[i];
        }
        System.out.println("총점: " + total);

        // 향상된 for문, 인덱스 번호 사용 불가
        for (int s : scores) {
            System.out.printf("점수: %d\n", s);
            total += s;
        }
        System.out.println("총점: " + total);

    }
}
