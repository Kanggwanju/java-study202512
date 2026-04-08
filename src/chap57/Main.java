package chap57;

public class Main {
    public static void main(String[] args) {
        // 제네릭의 두 가지 핵심 장점
        // 1. 타입 안정성 확보 (컴파일 단계 타입 오류 봉쇄)
        // 2. 불필요한 형변환 제거 (코드 깔끔, 안전)

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setItem("안녕하세요");
        String message = stringBox.getItem();

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setItem(100);
        int number = integerBox.getItem();

        System.out.println("message: " + message);
        System.out.println("number: " + number);
    }
}
