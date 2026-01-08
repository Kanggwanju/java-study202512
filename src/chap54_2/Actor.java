package chap54_2;

// final 클래스 - 상속 불가
public final class Actor {

    private String name;

    public void perform() {
        System.out.println(name + "이(가) 공연합니다!");
    }
}
