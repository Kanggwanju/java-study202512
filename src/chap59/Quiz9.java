package chap59;
// 반복문
public class Quiz9 {
    public static void main(String[] args) {
        int i, j;
        for (j = 0, i = 0; i <= 5; i++) {
            j += i;
            System.out.print(i);
            if (i == 5) {
                System.out.print("=");
                System.out.print(j);
            } else {
                System.out.print("+");
            }
        }
        // 정답: 0+1+2+3+4+5=15
    }
}
