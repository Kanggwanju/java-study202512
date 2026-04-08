package chap59;
// 빈칸 채우기 문제, 클래스, 상속

class Parent {
    public void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("Child");
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        Parent pa = new Child(); // 빈칸: new
        pa.show();
    }
}
