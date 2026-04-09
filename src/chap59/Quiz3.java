package chap59;
// 빈칸 채우기 문제, 클래스, 상속

class Parent1 {
    public void show() {
        System.out.println("Parent");
    }
}

class Child1 extends Parent1 {
    public void show() {
        System.out.println("Child");
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        Parent1 pa = new Child1(); // 빈칸: new
        pa.show();
    }
}
