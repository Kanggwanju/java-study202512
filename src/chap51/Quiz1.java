package chap51;

public class Quiz1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.set(5);
        // 정답: 5,5,7
        c.print(7);
    }
}

class Parent {
    int a = 1;
}
class Child extends Parent {
    int a = 2;

    void set(int a) {
        super.a = this.a = a;
    }
    void print(int a) {
        System.out.println(super.a + "," + this.a + "," + a);
    }
}