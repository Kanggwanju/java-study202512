package chap59;
// 빈칸

public class Quiz12 {
    public static void main(String[] args) {
        System.out.print(Quiz12.check(1));
    }

    // 빈칸: public static
    // 클래스명으로 직접 호출
    // 외부 호출을 위한 public, 객체 생성 없이 호출을 위한 static 메소드
    public static String check(int num) {
        return (num >= 0) ? "positive" : "negative";
    }
}
