package chap49;

public class Quiz3 {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10, 20);
        cal.add(10.5, 20.5);
    }
}

class Calculator {
    void add(int a, int b) {
        System.out.println("정수 합: " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("실수 합: " + (a + b));
    }
}
