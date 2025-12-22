package chap51.inherit;

// 상위 클래스 (super class)
// 부모의 속성이나 기능은 private을 사용하면 안된다. (protected 추천)
public class Idol {

    // 공통 속성
    protected String name;
    protected String groupName;

    // 부모의 생성자
    protected Idol() {
        System.out.println("아이돌 부모 기본 객체 생성됨!");
    }

    protected Idol(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
        System.out.println("아이돌 부모 객체 생성됨!");
    }

    // 공통 기능
    public void introduce() {
        System.out.printf("안녕하세요! %s의 %s입니다.\n", groupName, name);
    }
    public void perform() {
        System.out.println(name + "이(가) 무대에서 공연합니다.");
    }
}
