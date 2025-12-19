package chap51;

public class Quiz2 {

    public static void main(String[] args) {
        // 문제: new Child2(); 코드 실행시 결과는?
        new Child2();
        /*
            정답:
            P(1)
            C0
         */
    }
}

class Parent2 {
    Parent2(int x) {
        System.out.println("P(" + x + ")");
    }
}

class Child2 extends Parent2 {
    Child2() {
        super(1);
        System.out.println("C0");
    }

    Child2(int x) {
        super(x);
        System.out.println("C1");
    }
}
