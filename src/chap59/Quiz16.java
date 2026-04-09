package chap59;

class A1 {
    int a;
    int b;
}

public class Quiz16 {
    static void func1(A1 m) {
        m.a *= 10;
    }
    static void func2(A1 m) {
        m.a += m.b;
    }

    public static void main(String[] args) {
        A1 m = new A1();
        m.a = 100;
        func1(m);  // a: 1000
        m.b = m.a; // b: 1000
        func2(m);  // a: 2000
        System.out.printf("%d", m.a); // 2000
    }
}
