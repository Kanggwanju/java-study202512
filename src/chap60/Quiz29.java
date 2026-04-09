package chap60;

public class Quiz29 {
    public static void main(String[] args) {
        // new 키워드로 생성 시 항상 새 객체 -> 주소가 늘 달라짐
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3, 4};
        int[] c = new int[]{1, 2, 3};
        check(a, b);
        check(a, c);
        check(b, c);
        // 정답: NNN
    }
    public static void check(int[] a, int[] b) {
        if (a == b) { // 주소값 비교
            System.out.print("O");
        } else {
            System.out.print("N");
        }
    }
}
