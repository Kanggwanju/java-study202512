package chap59;
// 연산자
public class Quiz13 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 3, d = 5;

        // ^: 같으면 false, 다르면 true
        //    F     |    T        !(F)         F   ^   T
        // ->      T     &         T       &       T
        // ->  T
        if ((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)) {
            a = b + c; // 7

            // 7 == 4 ^ 3 != 7
            //   F    ^   T
            //       T
            if (7 == b ^ c != a) {
                System.out.println(a); // 7
            } else {
                System.out.println(b);
            }
        } else {
            a = c + d;
            if (7 == c ^ d != a) {
                System.out.println(a);
            } else {
                System.out.println(d);
            }
        }
    }
}
