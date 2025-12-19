package chap51;

public class Quiz3 {

    public static void main(String[] args) {
        // 정답: C:0
        new Child3();
    }
}

class Parent3 {
    Parent3() {
        // 부모 생성자에서 print를 했지만, 주체가 Child3 이므로
        // 메서드 호출시 자식 클래스의 오버라이딩 된 메서드가 실행된다.
        // Child 객체가 메모리에 생성되지 않았으므로, v=20이 아닌 v=0이 된다.
        print();
    }
    void print() {
        System.out.println("P:" + v);
    }
    int v = 10;
}

class Child3 extends Parent3 {
    int v = 20;
    Child3() {
        // super(); 생략됨
        v = 30;
    }

    @Override
    void print() {
        System.out.println("C:" + v);
    }
}
