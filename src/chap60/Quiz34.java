package chap60;

class Base {
    int x = 3;
    int getX() { return x * 2; }
}
class Derivate extends Base {
    int x = 7;
    int getX() { return x * 3; }
}

public class Quiz34 {

    public static void main(String[] args) {
        Base a = new Derivate();
        Derivate b = new Derivate();
        System.out.print(a.getX() + a.x + b.getX() + b.x);
        /*
            a.getX(): 실제 객체 Derivate의 메서드
            a.x     : 참조 타입 Base의 필드
            b.getX(): Derivate 객체의 메소드
            b.x     : 참조 타입 Derivate의 필드
         */
        // 정답: 21 + 3 + 21 +7 = 52
    }
}
