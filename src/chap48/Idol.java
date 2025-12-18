package chap48;

// 설계도 역할을 하는 클래스는 main 메서드를 만들지 않는다.
public class Idol {

    // 아이돌의 속성 : 필드
    String name;
    String groupName;

    // 아이돌의 기능 : 메서드
    void introduce() {
        System.out.println("안녕하세요! " + groupName + "의 " + name + "입니다.");
    }
}

// 실행용 클래스
class Main {

    public static void main(String[] args) {
        // 아이돌들을 만들어보자! - 객체 생성
        Idol wonyoung = new Idol();
        Idol karina = new Idol();

        wonyoung.name = "장원영";
        wonyoung.groupName = "아이브";

        karina.name = "카리나";
        karina.groupName = "에스파";

        wonyoung.introduce();
        karina.introduce();
    }

}
