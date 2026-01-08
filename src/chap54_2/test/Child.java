package chap54_2.test;

public class Child extends Parent {
    public static void showInfo() {
        System.out.println("Child 클래스");
    }
    
    @Override
    public void showName() {
        System.out.println("자식");
    }
}
