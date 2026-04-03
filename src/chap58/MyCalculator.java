package chap58;

// 컴파일러에게 "추상 메서드 하나뿐" 알림
@FunctionalInterface
interface MyCalculator {
    int calculate(int a, int b); // 추상 메서드 (구현은 람다식에서)
}
