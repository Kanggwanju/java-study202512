package chap59;

class A {
    int a;
    int b;
}

public class Quiz16 {
    static void func1(A m) {
        m.a *= 10;
    }
    static void func2(A m) {
        m.a += m.b;
    }

    public static void main(String[] args) {
        A m = new A();
        m.a = 100;
        func1(m);  // a: 1000
        m.b = m.a; // b: 1000
        func2(m);  // a: 2000
        System.out.printf("%d", m.a); // 2000
    }
}
