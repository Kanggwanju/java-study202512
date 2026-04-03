package chap56;

// 사용자 정의 예외 클래스
public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException (String message) {
        super(message); // 부모에게 메시지 전달
    }

}
