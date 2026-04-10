package chap60;

class Parent {
    int x = 100;
    Parent() { this(500); }
    Parent(int x) { this.x = x; }
    int getX() { return x; }

}

class Child extends Parent {
    int x = 4000;
    Child() { this(5000); }
    Child(int x) {
        // 명시적으로 super() 호출이 없으므로
        // 컴파일러에 의해 묵시적으로 super()가 삽입
        this.x = x;
    }

    /*
        super()는 항상 생성자의 첫 번째 줄에 묵시적으로 삽입
        중요한 것은 this() 호출도 생성자의 첫 번째 줄에만 올 수 있음
        this()를 사용하는 생성자에서는 super()가 호출되지 않을 수 있다.
        
        이 경우, this()가 호출하는 다른 생성자에서
        super()가 묵시적으로 호출되거나, 명시적으로 호출될 수 있다.
    */
}

public class Quiz23 {
    public static void main(String[] args) {
        Child obj = new Child();

        // Child 클래스는 getX() 메서드를 오버라이드하지 않았으므로,
        // Parent 클래스의 getX() 메서드가 호출
        System.out.println(obj.getX());
    }
}
