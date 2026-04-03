package chap58;

public class Main {
    public static void main(String[] args) {
        
        MyCalculator add = (a, b) -> a + b; // 덧셈 람다식
        execute(1, 3, add);

        MyCalculator subtract = (a, b) -> a - b; // 뺄셈 람다식
        execute(4, 2, subtract);
    }

    public static void execute(int x, int y, MyCalculator calculator) {
        int result = calculator.calculate(x, y);
        System.out.println("계산 결과: " + result);
    }

}
