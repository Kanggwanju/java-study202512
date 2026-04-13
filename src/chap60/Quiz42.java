package chap60;

public class Quiz42 {
    public static class Parent4 {
        public int x(int i) {return i + 2;}
        public static String id() {return "P";}
    }
    public static class Child4 extends Parent4 {
        public int x(int i) {return i + 3;}
        public String x(String s) {return s + "R";}
        public static String id() {return "C";}
    }

    public static void main(String[] args) {
        Parent4 ref = new Child4();

        // ref.x(2): 실제 객체(Child4)의 메소드 호출 (동적 바인딩)
        // ref.id(): 참조 변수 타입(Parent4) 기준 (정적 바인딩)
        // 정답: 5P
        // 5 + "P" = "5P" (문자열로 자동 변환)
        System.out.println(ref.x(2) + ref.id());
    }
}
