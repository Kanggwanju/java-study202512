package chap59;
// 클래스, 생성자, 상속
class A {
    private int a;

    public A(int a) {
        this.a = a;
    }

    public void display() {
        System.out.println("a=" + a);
    }
}

class B extends A {
    public B(int a) {
        super(a);
        display();
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        B obj = new B(10);

        // 정답: a=10
    }
}
