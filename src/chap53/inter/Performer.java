package chap53.inter;

// 상속은 한개의 클래스만 가능, 인터페이스는 다중 상속 가능
// 객체 생성 불가, 필드는 자동으로 public static final이 됨, 즉 상수만 선언 가능
public interface Performer {

    // 공연기능
    public abstract void perform(); // public abstract는 안 붙여도 자동으로 붙음

    // 공연연습기능
    public abstract void practice();
}
