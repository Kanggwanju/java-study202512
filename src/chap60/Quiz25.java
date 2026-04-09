package chap60;
// 빈칸
public class Quiz25 {
    public static void main(String[] args) {
        int m = 4620;

        // 빈칸 a,b,c,d
        int a = m / 1000; // 천원
        int b = (m % 1000) / 500; // 오백원
        int c = (m % 500) / 100; // 백원
        int d = (m % 100) / 10; // 십원

        System.out.println(a); // 4, 천원 4개
        System.out.println(b); // 1, 오백원 1개
        System.out.println(c); // 1, 백원 1개
        System.out.println(d); // 2, 십원 2개
    }
}
