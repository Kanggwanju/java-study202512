package chap51.exam;

class Parent {
    int a = 1;
}
class Child extends Parent {
    int a = 2;

    Child(int a) {
        // 부모 a와 자식 a를 모두 a로 설정
        super.a = this.a = a;
    }

    void print() {
        System.out.println("this.a = " + this.a);
        System.out.println("super.a = " + super.a);
    }
}

public class Case1 {

    public static void main(String[] args) {

        Child c = new Child(5);
        // 부모, 자식의 a 모두 5
        c.print();
    }
}
