package chap56;

public class ThrowException {
    
    public static void main(String[] args) {
        
        int age = 15;
        if (age < 19) {
            // 우리 규칙에 어긋나므로, 일부러 예외를 만들어서 던짐
            throw new IllegalArgumentException("19세 미만은 가입할 수 없습니다.");
        } else {
            System.out.println("성인 인증 완료! 가입을 환영합니다.");
        }
    }
}
