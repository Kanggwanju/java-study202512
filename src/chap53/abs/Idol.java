package chap53.abs;

// 추상 클래스
public abstract class Idol {

    // 공통 속성
    protected String name;
    protected String groupName;

    // 부모의 생성자
    protected Idol() {
//        System.out.println("아이돌 부모 기본 객체 생성됨!");
    }

    protected Idol(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
//        System.out.println("아이돌 부모 객체 생성됨!");
    }

    // 공통 기능
    // 추상 메서드 - 자식 클래스가 반드시 구현해야 함
    public abstract void introduce();
    public abstract void perform();
}
