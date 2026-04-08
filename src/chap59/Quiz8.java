package chap59;
// 빈칸
public class Quiz8 {
    public static void main(String[] args) {
        int[] a = new int[8];
        System.out.println(a[0]); // 기본값 0으로 초기화
        int i = 0;
        int n = 10;

        while (i < 8) { // 빈칸, i < 8 혹은 n > 0
            a[i++] = n % 2; // 빈칸, n % 2
            n /= 2;
        }

        // 출력결과: 00001010
        for (i = 7; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}
